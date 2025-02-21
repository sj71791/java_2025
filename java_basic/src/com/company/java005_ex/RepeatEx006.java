package com.company.java005_ex;

import java.util.Scanner;

public class RepeatEx006 {
	public static void main(String [] args) {
		Scanner scanner=new Scanner(System.in);
		for(;;) {
			System.out.print("숫자 입력(9입력받으면 종료) >");
			int i=scanner.nextInt();
			if(i==9) {break;}
			
		}
	}
}
