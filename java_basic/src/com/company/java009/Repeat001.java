package com.company.java009;

import java.util.Scanner;

public class Repeat001 {
	public static void main(String [] args) {
		char a;
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("문자 하나 입력 > ");
		a=scanner.next().charAt(0);
		
		if(a=='j') {
			System.out.println("java");
		}else if(a=='h') {
			System.out.println("html");
		}else if(a=='c') {
			System.out.println("css");
		}
	}
}
