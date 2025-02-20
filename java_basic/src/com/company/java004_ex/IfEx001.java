package com.company.java004_ex;

import java.util.Scanner;

public class IfEx001 {
	public static void main(String [] args) {
		int score1, score2; String result="불합격";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		score1=scanner.nextInt();
		if(score1>=60) {System.out.println("합격");}
		else {System.out.println("불합격");}
		
		// 1형식
		System.out.print("점수 입력 : ");
		score2=scanner.nextInt();
		if(score2>=60) {result="합격";}
		System.out.println(result);
	}
}
