package com.company.java008;

public class Repeat001 {
	public static void main(String [] args) {
		// 오류가 나는 이유는?
		byte b1=1, b2=2; 
//		byte result=b1+b2;
		byte result1=(byte)(b1+b2);
		int result2=b1+b2;
		//byte 자료형의 크기는 1바이트이기 때문에 b1+b2을 byte로 변환하여야 한다.
	}

}
