import React, {useState} from "react";  // react 불러오기
import PropTypes from 'prop-types'; // props 타입검사하는 역할
import Link from 'next/Link';
import {Menu, input, Row, Col} from 'antd';
import { AudioOutlined, UserOutlined, VerticalAlignBottomOutlined } from '@ant-design/icons';
import UserProfile from './UserProfile'
import LoginForm from './LoginForm'

const AppLayout = ({children}) => {
  ////////////////////////////////////////////// code
  const items = [
     { label: <Link href="/" >LOGO</Link>, key: '/' }
    , { label: <Link href="/profile" >프로필</Link>,  key: '/profile', 
        icon: <UserOutlined/> }
    , { label: <Link href="/signup" >회원가입</Link>, key: '/signup' }
    , { label: <input.Search
                placeholder="input search text"  
                enterButton 
                style={{verticalAlign:'middle'}} />, 
        key:'/search' }
    // , { label: <Link href="" }
  ];

  /// 1. 변수 vs useState
  // 단순대입시 state값의 변경점을 reactDom 알지 못함.
  // let logo = "My react";
  // const changeLogo = ()=>{console.log('...로고바꾸기'); logo="welcome!";}; 
  let [logo, setLogo] = useState('...TheJoa...'); // 2번째 - 함수를 통해서 재렌더링
  const changeLogo = ()=>{console.log('...로고바꾸기'); setLogo('★LOGIN★');};

  //2. login상태
  const [isLogin, setIsLogin] = useState(false); 
  //////////////////////////////////////////// view
  return(
    <div>
      <Menu mode="horizontal"  items={items} />
      <Row gutter={8}>
        <Col xs={24} md={4}> 
          {/*<h3 onClick={()=>{console.log('....')}}>{logo}</h3>*/}
          <h3 onClick={changeLogo}>{logo}</h3>
          { isLogin? <UserProfile setIsLogin={setIsLogin} /> : 
                     <LoginForm setIsLogin={setIsLogin}/> }
        </Col>
        <Col xs={24} md={14} style={{backgroundColor:'#efefef'}}> {children} </Col>
        <Col xs={24} md={6}> <div> 
          <a href="https://thejoa.com"
            target="_blank"
            rel="noreferer noopener">TheJoa</a> copyrights. all reserved. </div>  </Col>
      </Row>
    </div>
  );
};
AppLayout.propTypes = {
  children : PropTypes.node.isRequired
};

export default AppLayout;