package com.company.java004_ex;

import java.util.Scanner;

public class IfEx002 {
	public static void main(String [] args) {
		int a;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자입력 : ");
		a=scanner.nextInt();
		if(a>0) {System.out.println("양수");}
		else if(a<0) {System.out.println("음수");}
		else {System.out.print("zero");}
	}
}
