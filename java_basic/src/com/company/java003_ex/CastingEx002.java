package com.company.java003_ex;

import java.util.Scanner;

public class CastingEx002 {
	public static void main(String [] args) {
		int ko, en, ma, total, ran; double avg; 
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어점수 입력 > "); ko = scanner.nextInt();		
		System.out.print("영어점수 입력 > "); en = scanner.nextInt();
		System.out.print("수학점수 입력 > "); ma = scanner.nextInt();
		
		total=ko+en+ma;
		avg=total/3.0;
		ran=(int)avg/10;
		
		System.out.printf("국어 : %d\t영어 : %d\t수학 : %d\n총점 : %d\t평균 : %.2f\t레벨 : %d", ko,en,ma,total,avg,ran);
	}
}
