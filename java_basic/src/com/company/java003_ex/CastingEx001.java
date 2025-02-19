package com.company.java003_ex;

import java.util.Scanner;

public class CastingEx001 {
	public static void main(String [] args) {
		// 변수
		int num1, num2; double result;
		Scanner scanner = new Scanner(System.in);
		// 입력
		System.out.print("숫자입력1> ");
		num1 = scanner.nextInt();
		System.out.print("숫자입력2> ");
		num2 = scanner.nextInt();
		
		result = (float)num1/num2;
		
		System.out.printf("%d / %d = %.2f", num1,num2,result);
	}
}
