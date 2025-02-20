package com.company.java004_ex;

import java.util.Scanner;

public class ifEx007_1 {
	public static void main(String [] args) {
		// 연습문제7-1)
		int num1, num2; char a; String result="";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1. 정수를 하나 입력해주세요 > ");
		num1=scanner.nextInt();
		System.out.print("2. 정수를 하나 입력해주세요 > ");
		num2=scanner.nextInt();
		System.out.print("3. 연산자를 입력해주세요(+,-,*,/) > ");
		a=scanner.next().charAt(0);
		
		//1
		if(a=='+') {System.out.printf("%d + %d = %d",num1,num2,num1+num2);}
		else if(a=='-') {System.out.printf("%d - %d = %d",num1,num2,num1-num2);}
		else if(a=='*') {System.out.printf("%d * %d = %d",num1,num2,num1*num2);}
		else if(a=='/') {System.out.printf("%d / %d = %.2f",num1,num2,num1/(float)num2);}
		else {System.out.println("잘못 입력하셨습니다.");}
		
		// int(정수:4) + int(정수:2) + int(정수:4)
		// = 13
		//2
		if(a=='+') {System.out.println(""+num1+a+num2+"="+(num1+num2));}
		if(a=='-') {System.out.println(""+num1+a+num2+"="+(num1-num2));}
		if(a=='*') {System.out.println(""+num1+a+num2+"="+(num1*num2));}
		System.out.println(""+num1+a+num2+" = " + String.format("%.2f", (num1/(float)num2)));
		
		//3
		if(a=='+') {result=""+(num1+num2);}
		else if(a=='-') {result=""+(num1-num2);}
		else if(a=='*') {result=""+(num1*num2);}
		else if(a=='/') {result=String.format("%.2f", (num1/(float)num2));}
		System.out.println(""+num1+a+num2+" = "+result);
		
	}
}
