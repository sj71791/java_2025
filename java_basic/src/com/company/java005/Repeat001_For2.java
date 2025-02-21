package com.company.java005;

import java.util.Scanner;

public class Repeat001_For2 {
	public static void main(String [] args) {
		Scanner scanner=new Scanner(System.in);
		// 무한반복
		for(;;) { // 조건이 없으면 무한반복
			System.out.println("숫자1을 입력하시오.");
			int a=scanner.nextInt();
			if(a==1) {break;}
		}
		// for - break
		for(int i=1; i<=10; i++) { // 조건이 없으면 무한반복
			if(i==3) {break;}
			System.out.print(i+"\t"); 
		}
		// for - continue
		for(int i=1; i<=10; i++) { // 조건이 없으면 무한반복
			if(i==3) {continue;}
			System.out.print(i+"\t"); 
		}
		// 메뉴판 만들기
		// RepeatEx006 - 무한반복을 하는데 9를 입력받으면 종료
	}
}
