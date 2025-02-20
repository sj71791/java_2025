package com.company.java004_ex;

import java.util.Scanner;

	public class ifEx004_2 {
			public static void main(String [] args) {
				char a; 
				String result="알파벳만 입력가능합니다.";
				Scanner Scanner = new Scanner(System.in);
				
				System.out.print("알파벳 입력 : ");
				a=Scanner.next().charAt(0);
				if(a>='a' && a<='z') {result="소문자";}
				else if(a>='A' && a<='Z') {result="대문자";}
				System.out.print(result);
			}	
}
