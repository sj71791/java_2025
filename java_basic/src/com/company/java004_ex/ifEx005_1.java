package com.company.java004_ex;

import java.util.Scanner;

public class ifEx005_1 {
	public static void main(String [] args) {
		char a;
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("문자 입력 : ");
		a=scanner.next().charAt(0);
		if(a>='a' && a<='z') {a-=32;}
		else if(a>='A' && a<='Z') {a+=32;}
		else {System.out.print("영어 알파벳을 입력해주세요."); a=' ';}
		System.out.print(a);
	}
}
