import React from 'react';
import 'antd/dist/antd.css';
import PropTypes from 'prop-types';
import Head from 'next/head';

const TheJoa=({Component}) => {
  return (<>
    <Head>
      <meta charset='utf-8'/>
      <title>TheJoa</title>
    </Head>
    <Component/>
  </>);
}

TheJoa.propTypes = {
  Component : PropTypes.elementType.isRequired
}
export default TheJoa;
