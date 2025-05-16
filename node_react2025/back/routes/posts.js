const express = require('express');
const router = express.Router();
const {Post, User, Image, Comment} = require('../models'); 
const {Op} = require('sequelize');

// GET localhost:3065/posts
// 모든사용자 접근가능
// 글 10개씩 가져오기
router.get('/',async(req,res,next)=>{
  //res.send('posts - 10개');
  try{
    const where = {};
    // 맨마지막에서 10개카운트시 글중간에 추가  + [11] 10,,,
    if ( parseInt(req.query.lastId, 10) ) { where.id={ [Op.lt] : parseInt(req.query.lastId, 10) } }
    const posts = await Post.findAll({
      where,
      limit : 10,
      order : [
        ['createdAt', 'DESC'], 
        [Comment, 'createdAt', 'DESC']
      ],
      include: [
          {model:User, attributes: ['id', 'nickname']}
        , {model:Image}
        , {model:Comment, include:[{model:User, attributes:['id', 'nickname']}]}
        , {model:User, as: 'Likers', attributes:['id']}
        , {model:Post, as: 'Retweet', include: [{model: User, attributes: ['id','nickname']}, {model:Image} ]}  // 원본글 작성자와 이미지 포함
      ]
    });
    res.status(200).json(posts);
  }catch(error){
    console.error(error);
    next(error);
  }
});

module.exports = router;

// create : 객체.create({})
// select : 객체.findAll, 객체.findOne
// update : 객체.update
// delete : 객체.destroy()