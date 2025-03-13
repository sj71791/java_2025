package com.company.java018_ex;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class Network_Ex001 {
	public static void main(String[] args) {
		try {
			String apiurl = "https://openapi.naver.com/v1/search/book.json?query=" 
					+ URLEncoder.encode("경제","UTF-8");
			URL url=new URL(apiurl);
			//HttpURLConnection
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			//요청파라미터
			conn.setRequestMethod("GET");
			conn.setRequestProperty("X-Naver-Client-Id", "IPqzajt0wLtImaLYOu1S");
			conn.setRequestProperty("X-Naver-Client-Secret", "yk0MyX4Ig4");
			
			//응답코드 - 200
			//System.out.println(conn.getResponseCode());
			int code = conn.getResponseCode();
			BufferedReader br;
			if(code==200) {
				br=new BufferedReader(new InputStreamReader(conn.getInputStream()));
			}else {
				br=new BufferedReader(new InputStreamReader(conn.getErrorStream()));
			}
			//응답
			String line=""; StringBuffer sb=new StringBuffer();
			while((line=br.readLine()) !=null) {sb.append(line+"\n");}
			
			System.out.println(sb.toString());
			br.close(); conn.disconnect();
			
		}catch (Exception e) { e.printStackTrace(); }
	}
	
}
/*
Client Id
Client Secret

# URL
https://openapi.naver.com/v1/search/book.xml	XML
https://openapi.naver.com/v1/search/book.json	JSON

# 요청 파라미터
GET / query
*/