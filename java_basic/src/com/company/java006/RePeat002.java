package com.company.java006;

import java.util.Scanner;

public class RePeat002 {
	public static void main(String [] args) {
		int a; String st="";
		Scanner scanner=new Scanner(System.in);
		System.out.print("a 값 입력 > ");
		a=scanner.nextInt();
		switch(a) {
		case 10: st="10이다"; break;
		case 20: st="20이다"; break;
		case 30: st="30이다"; break;
		}
		System.out.println(st);
	}
}
