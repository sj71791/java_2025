package com.company.java014;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception003 {
	public static int nextInt() throws InputMismatchException{ //##2-2발생한지점
		int a=-1;
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 입력 > ");
		a=scanner.nextInt();
		return a;
	}
	
	public static void main(String[] args) /*throws Exception*/{
		int a=-1;
		while(true) {
			try {
			a=nextInt();
			if(a==1) {break;}
			}catch(Exception e) {System.out.println("오류났어!");}
		}
		System.out.println("결과물 : "+a);
	}
}
/*	1) main안에서
Exception in thread "main" java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:964)
	at java.base/java.util.Scanner.next(Scanner.java:1619)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2284)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2238)
	at com.company.java014.Exception003.nextInt(Exception003.java:10)
	at com.company.java014.Exception003.main(Exception003.java:15)
	
	2) method
Exception in thread "main" java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:964)
	at java.base/java.util.Scanner.next(Scanner.java:1619)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2284)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2238)
	at com.company.java014.Exception003.nextInt(Exception003.java:10)
	at com.company.java014.Exception003.main(Exception003.java:15)
*/