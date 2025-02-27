package com.company.java009;

import java.util.Scanner;

public class Repeat002 {
	public static void main(String[] args) {
		char a;
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("문자 하나 입력 > ");
		a=scanner.next().charAt(0);
		
		switch(a) {
		case 'j': System.out.println("java"); break;
		case 'c': System.out.println("css"); break;
		case 'h': System.out.println("html");
		}
	}
}
