module.exports = ( sequelize, DataTypes ) => {
  // const User
  const User = sequelize.define('User', {// users테이블 - 자동으로 s 붙어서 생성
    //id 기본값으로 자동설정
    email: {
      type : DataTypes.STRING(30), //STRING, TEXT, BOOLEAN, INTEGER, FLOAT, DATETIME
      allowNull: false, // 필수
      unique : true // 고유값
    },
    nickname: {
      type: DataTypes.STRING(30), //STRING, TEXT, BOOLEAN, INTEGER, FLOAT, DATETIME
      allowNull: false //필수
    },
    password: {
      type: DataTypes.STRING(100), //STRING, TEXT, BOOLEAN, INTEGER, FLOAT, DATETIME
      allowNull: false //필수
    }
  }, {
    charset : 'utf8',
    collate : 'utf8_general_ci' //한글저장
  });
  // 관계설정
  User.associate = (db) => {
    db.User.hasMany(db.Post);
    db.User.hasMany(db.Comment);
    db.User.belongsToMany(db.Post, { through: 'Like', as:'Liked' });
    db.User.belongsToMany(db.User, { through: 'Follow', as:'Followers', foreignKey: 'FollowingId'});
    //                                                      user.getFollowers()
    // Follow 테이블에서 팔로우하는사람 (FollowingId)을 기준으로 관계설정 - 팔로우하는 사람 ID
    db.User.belongsToMany(db.User, { through: 'Follow', as:'Followings', foreignKey: 'FollowerId'});
    //                                                      user.getFollowings()
  };
  return User;
};
/*
- 유저는 많은 post를 가진다.   1:다  hasMany
- 유저는 많은 comment를 가진다.  1:다  hasMany
- 좋아요 : User객체와 Post 객체사이에  다:다  belongsToMany / 테이블명: like / 별칭: liked  
 - 팔로우 : 내가 올린 게시물을 보는 사람
  user객체에서 User테이블사이	belongsToMany / 테이블명 : follow / 별칭: followers / fk : followingId

- 팔로잉 : 내가 팔로우한 사람의 게시물을 볼 수 있는 상태
user객체에서 User테이블사이	belongsToMany / 테이블명 : follow / 별칭: followings / fk : followingId

5) 멤버관리 - [models] - user.js
  id  기본값
  email  varchar(30)  필수, unique
  nickname varchar(30)  필수, unique
  password varchar(30)  필수, unique
  createAt, updatedAt
*/