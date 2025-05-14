module.exports = (sequelize, DataTypes) => {
  const Hashtag = sequelize.define('Hashtag', {
    name: {
      type: DataTypes.STRING(20),
      allowNull: false
    }
  },{
    charset : 'utf8mb4',
    collate : 'utf8mb4_general_ci' //한글저장
  });
  Hashtag.associate = (db) => {
    db.Hashtag.belongsToMany(db.Post, {through: 'PostHashtag'})
  };
  return Hashtag;
};
/*
9) 댓글 관리 - [models] - hashtag.js
  id 기본값
  name varchar(20) 필수
  createAt, updatedAt
*/