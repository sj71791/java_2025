package com.company.java003;

public class Casting001 {
	public static void main(String [] args) {
		// #1. 형변환 - 자동타입변환
		// byte < short < int < long < float < double
		byte by=1; // 1byte
		short sh=2; // 2byte
		int in=4; // 4byte
		long l=8L; // 8byte
		float f=3.14f; // 4byte
		double d=3.14; // 8byte
		
		sh = by; in = by; l = by;
		
//		l = f; //정수(8byte) - 실수(4byte) 정수 < 실수
		f = l; //실수(4byte) - 정수(8byte)
		
		// boolean 1byte
		boolean b1 = true;
//		in = b1; boolean은 형변환안됨
		
		// #2. 형변환 - 강제타입변환
		by = (byte)in; // 정수(1byte) - 정수(4byte)
		int in2 = (int)1.2; // 정수(4byte) - 실수(double : 8byte)
		float f12= (float)3.14111111111111; // 실수(4byte) - 실수
		// float : 소수점자리 7자리 - 소수점자리 15자리
		
		System.out.println(in2); //1
		System.out.println(f12); //3.1411111
		
		// Q1) System.out.println( 1.5 + 2.7 ); 3으로 나오게 만들기
		System.out.println( 1.5 + 2.7 ); // 결과 : 3
		int num1 = (int)1.5;
		int num2 = (int)2.7;
		System.out.println("결과 : "+(num1+num2)); 
	}
}
