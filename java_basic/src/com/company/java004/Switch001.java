package com.company.java004;

import java.util.Scanner;

public class Switch001 {
	public static void main(String [] args) {
		// 변수
		int a=0;
		Scanner scanner=new Scanner(System.in);
		// 입력
		System.out.print("숫자입력 : ");
		a=scanner.nextInt();
		// 처리 (if/switch/for, while, do while)
		// if ver - a가 1이면 1이다, 2면 2이다, 3이면 3이다
		if(a==1) {System.out.println("1");}   
		else if(a==2) {System.out.println("2");}
		else if(a==3) {System.out.println("3");}
		
		// 출력
		// switch는 break를 만날 때 나옴.
		// sc b
		switch(a) {
			case 1: System.out.println("1"); break;
			case 2: System.out.println("2"); break;
			case 3: System.out.println("3"); break;
		}
	}
}
