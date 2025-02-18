package com.company.java002_ex;

import java.util.Scanner;

public class DataTypeEx002 {
	public static void main(String [] args) {
		// 1. 변수
		Scanner scanner = new Scanner(System.in);
		int like;
		
		// 2. 입력
		System.out.print("좋아하는 수(정수)를 입력하세요> ");
		like = scanner.nextInt();
		
		// 3. 처리
		
		// 4. 출력
		System.out.println("좋아하는 숫자는 "+like+"입니다");
		System.out.printf("좋아하는 숫자는 %d입니다",like);	
	}
}
