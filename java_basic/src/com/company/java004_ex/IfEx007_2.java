package com.company.java004_ex;

import java.util.Scanner;

public class IfEx007_2 {
	public static void main(String [] args) {

		double num1,num2,sum; char a;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1. 정수를 하나 입력해주세요 > ");
		num1=scanner.nextInt();
		System.out.print("2. 정수를 하나 입력해주세요 > ");
		num2=scanner.nextInt();
		System.out.print("3. 연산자를 입력해주세요(+,-,*,/) > ");
		a=scanner.next().charAt(0);
		
		if(a=='+') {sum=num1+num2;}
		else if(a=='-') {sum=num1-num2;}
		else if(a=='*') {sum=num1*num2;}
		else {sum=num1/num2;}
		System.out.printf("%d %c %d = %.2f",(int)num1,a,(int)num2,sum);

	}
}
