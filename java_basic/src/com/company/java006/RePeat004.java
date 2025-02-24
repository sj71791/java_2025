package com.company.java006;

import java.util.Scanner;

public class RePeat004 {
	public static void main(String [] args) {
		int a; 
		Scanner scanner = new Scanner(System.in);
		
		for(;;) {
			System.out.print("a 값 입력 > ");
			a=scanner.nextInt();
			if(a==1) {
				break;
			}
		}
	}
}
