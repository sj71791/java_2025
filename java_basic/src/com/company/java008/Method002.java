package com.company.java008;

public class Method002 {
	public static void myint(int a) {System.out.println(a);}
	public static void myadd(int a, int b) {System.out.println(a+b);}
	public static void main(String[] args) {
		//public static void myint(int a){해당값 출력}
		myint(1); //1출력
		myint(2); //2출력
		
		//public static void myadd(int a, int b){해당 더해서 출력}
		myadd(1,2); //3
		myadd(10,3); //13
	}
}
