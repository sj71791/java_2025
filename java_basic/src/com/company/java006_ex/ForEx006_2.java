package com.company.java006_ex;

import java.util.Scanner;

public class ForEx006_2 {
	public static void main(String [] args) {
		int a=-1, b=-3; char ch=' '; String result="";
		Scanner scanner = new Scanner(System.in);
		
		/* break (빠져나와!)/continue(밑에꺼 skip)
		 * for(;;) { //1-1. 무한반복
		 * 		#todo1 if(잘못썼으면){숫자1 입력받기} -> if(!(0<=num1 && num1<=100)){숫자1입력받기}
		 * 		#todo1 if(잘못썼으면){숫자2 입력받기}
		 * 		#todo1 if(잘못썼으면){연산자입력받고}
		 * 		1-2. 빠져나올조건-빠져나오기 break
		 * }
		 */
		for(;;) {
			if(!(0<=a && a<=100)) { //잘쓴범위 아니라면 입력시도 / 잘쓴범위면 입력x
				System.out.print("a값 입력(0~100) > ");
				a=scanner.nextInt();
			}else if(0>b || b>100) {
				System.out.print("b값 입력(0~100) > ");
				b=scanner.nextInt();
			}else if(!(ch=='+' || ch=='-' || ch=='*' || ch=='/')) {
				System.out.print("연산자 입력(+,-,*,/) > ");
				ch=scanner.next().charAt(0);
				continue;
			}else{break;}
		}

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
