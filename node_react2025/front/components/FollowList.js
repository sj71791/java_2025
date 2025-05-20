import { Card, Button, List } from 'antd';
import React from 'react';
import {UserDeleteOutlined} from '@ant-design/icons';

const FollowList = ({header, data}) => {
  /////////////////////////////////// code
  /////////////////////////////////// view
  return (<List  style={{margin:'3%', backgroundColor:'white', padding:'3%'}}
      grid={{gutter:4, xs:2, md:4}}
      size='small'
      header={<div>{header}</div>}
      loadMore={<div style={{textAlign:'center'}}><Button>더보기</Button></div>}
      dataSource={data}
      renderItem={(item) => (
        <List.Item>
          <Card  actions={[<UserDeleteOutlined  key="plus" />]} >
            <Card.Meta description={item.nickname}/>
          </Card>
        </List.Item>
      )}
  /> );
};  // https://ant.design/components/icon?locale  ()=>{}  ()=>()  

export default FollowList;