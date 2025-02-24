package com.company.java006;

import java.util.Scanner;

public class RePeat001 {
	public static void main(String [] args) {
		int a; String st="";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("a 값 입력 > ");
		a=scanner.nextInt();
		if(a==10) {
			st="10이다";
		}
		else if(a==20) {
			st="20이다";
		}
		else if(a==30) {
			st="30이다";
		}
		
		System.out.println(st);
	}
}
