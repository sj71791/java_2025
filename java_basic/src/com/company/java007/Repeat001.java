package com.company.java007;

import java.util.Scanner;

public class Repeat001 {
	public static void main(String [] args) {
		char ch; String st="";
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("입력(a,b,c) > ");
		ch=scanner.next().charAt(0);
		
		if(ch=='a') {
			st="apple";
		}
		else if(ch=='b') {
			st="banana";
		}
		else if(ch=='c') {
			st="coconut";
		}
		
		System.out.println(st);
	}
}
/*
	이론
	1. 자바의 자료형은 ( 기본형 ) / ( 참조형 ) 로 분류된다.
	2. 자바의 기본형은 ( byte(1b), short(2b), int(4b), long(8b), float(4b), double(8b), char(2b), boolean(1b) )
	3. 자바의 형변환은 ( 논리형 ) 빼고 기본형에서 가능하다.
	
	4. ch가 대문자일경우 조건식 작성
	if(ch>='A' && ch<='Z')
	
	5. ch가 소문자일경우 조건식 작성
	if(ch>='a' && ch<='z')
	
	6. a가 0~100사이일 경우 조건식 작성
	if(a>=0 && a<=100)
 */
