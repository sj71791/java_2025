module.exports = (sequelize, DataTypes) => {
  const Image = sequelize.define('Image',{
    src: {
      type: DataTypes.STRING(200),
      allowNull: false
    } 
   }, {
      charset : 'utf8',
      collate : 'utf8_general_ci' //한글저장
  });
  // 관계설정
  Image.associate = (db) => {
    db.Image.belongsTo(db.Post);
  };
  return Image;
};
/*
7) 이미지 관리 - [models] - images.js
  id 기본값
  src varchar(200) 필수
  createAt, updatedAt
*/