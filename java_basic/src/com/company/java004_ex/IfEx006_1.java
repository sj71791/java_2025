package com.company.java004_ex;

import java.util.Scanner;

public class IfEx006_1 {
	public static void main(String [] args) {
		int a;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자 입력(홀수는남성, 짝수는여성 출력) : ");
		a=scanner.nextInt();
		
		if(a%2==0) {System.out.print("여성");}
		else {System.out.print("남성");}
	}

}
