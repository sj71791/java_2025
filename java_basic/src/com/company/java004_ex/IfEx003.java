package com.company.java004_ex;

import java.util.Scanner;

public class IfEx003 {
	public static void main(String [] args) {
		int a;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자입력 : ");
		a = scanner.nextInt();
		
		if(a==1) {System.out.println("One");}
		else if(a==2) {System.out.println("Two");}
		else if(a==3) {System.out.println("Three");}
		else {System.out.println("1,2,3이 아니다");}
	}
}
