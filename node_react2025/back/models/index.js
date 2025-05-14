const Sequelize = require('sequelize');
const env = process.env.NODE_ENV || 'development';
const config = require('../config/config')[env];
const db = {}; //객체를 생성해서 객체저장공간만들기

const sequelize = new Sequelize(config.database, config.username, config.password, config);
//db, username, password, config  설정정보이용해서 인스턴스 생성

//1. sequelize - 모델정의
db.User = require('./user')(sequelize, Sequelize);
db.Post = require('./post')(sequelize, Sequelize);
db.Image = require('./image')(sequelize, Sequelize);
db.Hashtag = require('./hashtag')(sequelize, Sequelize);
db.Comment = require('./comment')(sequelize, Sequelize);

//2. 모델 관계설정
Object.keys(db).forEach(modelName =>{
  if(db[modelName].associate){ // model 안에 modelName associate가 있다면
    db[modelName].associate(db);
  }
});

db.sequelize = sequelize;
db.Sequelize = Sequelize;

module.exports = db;