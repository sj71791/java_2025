package com.company.java005_ex;

import java.util.Scanner;

public class Repeat002 {
	public static void main(String [] args) {
		int a; String st="";
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("숫자 입력 > ");
		a=scanner.nextInt();
		
		switch(a) {
		case 1: st=String.format("%d이다", a); break;
		case 2: st=String.format("%d이다", a); break;
		case 3: st=String.format("%d이다", a); break;
		
		}
		System.out.println(st);
		
	}
}
