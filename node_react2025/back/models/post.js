module.exports = ( sequelize, DataTypes ) => {
  const Post = sequelize.define('Post', {
    //id 기본설정
    content: {
      type: DataTypes.TEXT,
      allowNull: false
    }
  }, {
    charset: 'utf8mb4',
    collate: 'utf8mb4_general_ci' // 이모티콘
  }); 
  Post.associate = (db) => {
    db.Post.hasMany(db.Image);    // post.addImage, post.getImages ,
    db.Post.hasMany(db.Comment);  // post.addComments, post.getComments
    db.Post.belongsTo(db.User);   // post.addUsers, post.getUsers, post.setUsers
    db.Post.belongsTo(db.Post, {as :'Retweet'});  // post.addRetweet
    db.Post.belongsToMany(db.Hashtag, {through: 'PostHashtag'});  // post.addHashtags
    db.Post.belongsToMany(db.User , {through: 'Like', as:'Likers'})
  };
  return Post;
}; 
/*
6) 
관계설정
   게시글은 Image를 갖는다       1:다  hasMany
   게시글은 Comment를 갖는다   1:다 hasMany

   게시글은 유저에 속해있다	    belongsTo
   ※ User 객체 : 유저는 많은 post를 가진다. 1:다  hasMany
   Post           User

   - 리트윗(공유) 게시글은 많은-트윗-공유(게시글 : Post)를 갖는다  1:다 belongsTo

   - 해시태그  게시글은 많은 해시태그를 갖는다. belongsToMany   (Hashtag) 중간테이블 : PostHashtag
   - 좋아요     게시글은 많은 좋아요를 갖는다. belongsToMany  (User) 중간테이블 : Like , as:Likers 

포스트(게시판) 관리 - [models] - post.js
  id 기본값
  content  text  필수
  createAt, updatedAt
*/