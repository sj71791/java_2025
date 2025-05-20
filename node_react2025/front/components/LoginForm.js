import React, { useCallback, useState } from 'react';
import {Input, Button, Form, Row, Col} from 'antd';
import Link from 'next/Link';
import userInput from '../hooks/userInput';

const LoginForm = ({setIsLogin}) => {
  //////////////////////////////////////////////// code
  // const [id, setId] = useState('');  // 상태관리 - 컴포넌트에서 값이 변경
  // const onChangeId = useCallback((e) => {
  //   console.log(e.target.value);
  //   setId(e.target.value);
  // }, []);  // function - 함수의 재생성

  // const [password, setPassword] = useState('');
  // const onChangePassword = useCallback((e) => {
  //   console.log(e.target.value);
  //   setPassword(e.target.value);
  // });

  // Q. 로그인 버튼 클릭 시 count의 숫자 증가, 콘솔창에 숫자 증가 (useState)
  // const [count, setCount] = useState('');
  // const onCount = () => {
  //   setCount(count + 1);
  //   console.log();
  // };

  const [id, onChangeId] = userInput('');
  const [password, onChangePassword] = userInput('');

  const onsubmitForm = useCallback(() => {  // 컴포넌트가 처음 렌더링할때 한번만 생성
    console.log(id, password);
    setIsLogin(true);
  }, [id, password]);  // id, password 값이 변경될때

  //////////////////////////////////////////////// view
  return (
    <>
      <Form layout="vertical" style={{padding:'3%'}} onFinish={onsubmitForm}>
          <Form.Item label="아이디">
            <Input placeholder="user@gmail.com 형식으로 입력" name="id" value={id} onChange={onChangeId} required />
          </Form.Item>
          <Form.Item label="비밀번호">
            <Input.Password placeholder="비밀번호 입력" name="password" value={password} onChange={onChangePassword} required />
          </Form.Item>
          <Form.Item style={{textAlign:'center'}}>
            <Button type="primary" style={{marginRight:'2%'}} htmlType='submit' loading={false}>로그인</Button>
            {/* <Button onClick={onCount} type="primary" style={{marginRight:'2%'}}>로그인{count}</Button> */}
            <Link href="/signup" legacyBehavior><a><Button>회원가입</Button></a></Link>
          </Form.Item>
      </Form>
    </>
  );
};

export default LoginForm;