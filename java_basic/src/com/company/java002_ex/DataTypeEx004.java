package com.company.java002_ex;

import java.util.Scanner;

public class DataTypeEx004 {
	public static void main(String [] args) {
		// 변수
		int ko, en, ma, total; double avg;
		Scanner scanner = new Scanner(System.in);
		// 입력
		System.out.print("국어점수를 입력하시오. ");
		ko = scanner.nextInt();
		System.out.print("영어점수를 입력하시오. ");
		en = scanner.nextInt();
		System.out.print("수학점수를 입력하시오. ");
		ma = scanner.nextInt();
		// 처리
		total = ko+en+ma;
		avg = total/3.0;
		// 출력
		System.out.printf("총점: %d \n평균: %.2f", total, avg);
		System.out.println("총점 : "+ (ko+en+ma));
		System.out.printf("평균 : %.2f", (float)(en+ko+ma)/3);
	}
}
