package com.company.java006_ex;

import java.util.Scanner;

public class ForEx006 {
	public static void main(String [] args) {
		int a, b; char ch; String result="";
		Scanner scanner=new Scanner(System.in);
		
		for(;;) {
			System.out.print("a값 입력(0~100) > ");
			a=scanner.nextInt();
			if(a>=0 && a<=100) {
				break;
			}
		}
		for(;;) {
			System.out.print("b값 입력(0~100) > ");
			b=scanner.nextInt();
			if(b>=0 && b<=100) {
				break;
			}
		}
		for(;;) {
			System.out.print("연산자 입력(+,-,*,/ > ");
			ch=scanner.next().charAt(0);
			if(ch=='+' || ch=='-' || ch=='*' || ch=='/') {
				break;
			}
		}
		// for
		
		if(ch=='+') {
			result=""+(a+b);
		}
		else if(ch=='-') {
			result=""+(a-b);
		}
		else if(ch=='*') {
			result=""+(a*b);
		}
		else {
			result=String.format("%.2f", (a/(float)b));
		}
		System.out.print(""+a+ch+b+"="+result);	
		
	}
}
