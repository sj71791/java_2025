package com.company.java004_ex;

import java.util.Scanner;

public class IfEx004_1 {
	public static void main(String [] args) {
		char a; 
		Scanner Scanner = new Scanner(System.in);
		
		System.out.print("알파벳 입력 : ");
		a=Scanner.next().charAt(0);
		if(a>='a' && a<='z') {System.out.print("소문자");}
		else if(a>='A' && a<='Z') {System.out.print("대문자");}
		else{System.out.print("알파벳이 아닙니다");}
	}
}
