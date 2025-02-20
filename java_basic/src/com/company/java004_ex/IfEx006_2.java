package com.company.java004_ex;

import java.util.Scanner;

public class IfEx006_2 {
	public static void main(String [] args) {
		int a;
		Scanner scanner = new Scanner(System.in);
		String result="여자";
		System.out.print("숫자 입력(홀수는남성, 짝수는여성 출력) : ");
		a=scanner.nextInt();
		
		if(a%2!=0) {result="남자";}
		System.out.println(result);
	}
}
