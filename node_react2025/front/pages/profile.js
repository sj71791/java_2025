import React from "react"; 
import AppLayout from "../components/AppLayout";
import Head from 'next/head';

const profile = () => {
  return(
    <>
      <Head>
        <meta charset="utf-8"/>
        <title>Profile | TheJoa</title>
      </Head>
      <AppLayout>내프로필</AppLayout>
    </>
);
}
export default profile;