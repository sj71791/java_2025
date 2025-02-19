package com.company.java003_ex;

import java.util.Scanner;

public class CastingEx003 {
	public static void main(String [] args){
		char alp=' ';
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("알파벳 대문자를 입력하세요 > ");
		alp = scanner.next().charAt(0);
		//처리(1)
		//alp += 32;
		//System.out.println("소문자는 "+ alp);
		
		//처리(2)
		alp = (char)(alp+32);
		System.out.println(alp);
		
		//Q 실수에 정수대입시 실수로
		float f1 = 1+1.0f;
		System.out.print(f1);
	}
}
