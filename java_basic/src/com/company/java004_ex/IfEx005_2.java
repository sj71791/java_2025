package com.company.java004_ex;

import java.util.Scanner;

public class IfEx005_2 {
	public static void main(String [] args) {
		char a;
		Scanner scanner=new Scanner(System.in);
		String result="알파벳을 입력해주세요!";
		System.out.print("문자 입력 : ");
		a=scanner.next().charAt(0);
		if(a>='a' && a<='z') {result =""+ (char)(a-=32);}
		else if(a>='A' && a<='Z') {result =""+  (char)(a+=32);}
		System.out.print(result);
	}
}
