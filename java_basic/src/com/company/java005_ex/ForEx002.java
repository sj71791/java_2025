package com.company.java005_ex;

import java.util.Scanner;

public class ForEx002 {
	public static void main(String [] args) {
		// 연습문제2
		String st="";
		int a;
		Scanner scanner=new Scanner(System.in);
	    System.out.print("몇 단? > ");
	    a=scanner.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(a+"*"+i+"="+(a*i));
		}
		
	}
}
