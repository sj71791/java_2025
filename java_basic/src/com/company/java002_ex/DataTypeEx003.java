package com.company.java002_ex;

import java.util.Scanner;

public class DataTypeEx003 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		float pi = 0.0f;
		
		System.out.print("파이값을 입력하시오> ");
		pi = scanner.nextFloat();
		
		System.out.println("파이값은 "+pi+"입니다");
		System.out.printf("파이값은 %f입니다", pi);
	}

}
