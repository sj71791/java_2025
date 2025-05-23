module.exports = (sequelize,DataTypes) => {
  const Comment = sequelize.define('Comment',{
    content : {
      type: DataTypes.TEXT,
      allowNull: false
    }
  },{
    charset : 'utf8mb4',
    collate : 'utf8mb4_general_ci'
  });
  Comment.associate = (db) => {
    db.Comment.belongsTo(db.Post)
    db.Comment.belongsTo(db.User)
  };
  return Comment;
};
/*
8) 댓글 관리 - [models] - comment.js
  id 기본값
  comment text 필수
  createAt, updatedAt
*/