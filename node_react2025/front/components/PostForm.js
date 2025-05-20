import { Form, Input, Button } from "antd";
import React from "react";

const PostForm = () => {

  return (<Form layout="vertical" style={{margin:'3%'}}>
    <Form.Item label="Write :" name="text">
      <Input.TextArea placeholder="게시글을 적어주세요" 
        maxLength={200} style={{height: '150px'}}/>
    </Form.Item>
    <Form.Item>
      <input type="file" name="image" multiple hidden />
      <Button>이미지업로드</Button>
      <Button type="primary" style={{float:'right'}} htmlType="submit">POST</Button>
    </Form.Item>
  </Form>);
};
export default PostForm;