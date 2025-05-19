import React, {useCallback, useState} from 'react'
import { Input, Button, Form, Row, Col } from 'antd';
import Link from 'next/Link';

const LoginForm = ()=>{
  //////////////////////////////////////// code
  const [id, setId] = useState('');  // 상태관리 - 컨포넌트에서 값이 변경
  const onChangeId = useCallback(( e ) => { 
    console.log(e.target.value);
    setId(e.target.value); },[]
  );  // function - 함수의 재생성

  const [password, setPassword] = useState('');
  const onChangePassword = useCallback((e) => {
    console.log(e.target.value);
    setPassword(e.target.value);
  });

  //Q. 로그인버튼 클릭시 count의 숫자 증가, 콘솔창에 숫자증가 (useState)
  const [count, setCount] = useState(1);
  const onCount = () => {
    setCount(count+1); 
    console.log(count);
  }

  //////////////////////////////////////// view
  return (
    <>
      <Form layout="vertical" style={{padding:'3%'}}>
        <Form.Item label="Username" name="username">
          <Input placeholder='user@gmail.com 형식으로 입력' 
          name="id" value={id} onChange={onChangeId} required />
        </Form.Item>
        <Form.Item label="비밀번호">
          <Input placeholder='비밀번호 입력' 
                 name='id' value={id} onChange={onChangeId} required/>
        </Form.Item>
        <Form.Item style={{textAlign: 'center'}}>
          {/* <Button onClick={onCount} type="primary" style={{marginRight:'2%'}}>로그인{count}</Button> */}
          <Button type="primary" style={{marginRight:'2%'}}>로그인</Button>
          <Link href="/signup" legacyBehavior><a><button>회원가입</button></a></Link>
        </Form.Item>
      </Form>
    </>
  );
};
export default LoginForm;