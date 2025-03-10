package com.company.java016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception005 {
	public static int nextInt() throws InputMismatchException{
		int one=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("1을 입력하세요");
		one=scanner.nextInt();
		return one;
		
	}
	public static void main(String [] main) {
		int one=0;
		while(true) {
			try{
			one=nextInt(); 
			if(one==1)break;
			}
			catch(Exception e) {System.out.println("정수값을 입력해야함");}
		}
	}
}
