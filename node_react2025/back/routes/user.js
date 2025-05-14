const express = require('express');
const router = express.Router();
const bcrypt = require('bcrypt');
const passport = require('passport');
const {} = require('../models');

// 1. 회원가입
// localhost:3065/user/
router.post('/', async(req, res, next) => { //res.send('......회원가입');
  try{
    //1. 이메일중복확인 sql - select : 객체.findOne
    const user = await User.findOne({where: {email: req.body?.email ,}});
    //2. 결과확인 - 존재하면 이미사용중인 아이디입니다.
    if(user){return res.status(403).send('이미 사용중인 아이디입니다.');}
    //3. 비밀번호 암호화
    const hashPassword = await bcrypt.hash(req.body.password, 12); //암호화강도 10~13
    //4. 사용자 생성 객체.create
    await User.create({
      email: req.body.email,
      nickname: req.body.nickname,
      password:hashPassword,
    });
    //5. 응답 - 회원가입 성공 ok
    res.status(201).send('회원가입완료!');
  }catch (error){
    console.error(error);
    next(error);
  }
});

module.exports = router;

// 2. 로그인
// localhost:3065/user/login
router.post('/login', async (req, res, next)=>{
  res.send('..... login');
}); 