package com.company.java007;

import java.util.Scanner;

public class Repeat002 {
	public static void main(String[] args) {
		char ch; String st="";
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("입력(a,b,c) > ");
		ch=scanner.next().charAt(0);
		
		switch(ch) {
		case 'a': st="apple"; break;
		case 'b': st="banana"; break;
		case 'c': st="coconut"; break;
		}
		
		System.out.println(st);
	}
}
