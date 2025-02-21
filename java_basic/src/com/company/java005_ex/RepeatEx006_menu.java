package com.company.java005_ex;

import java.util.Scanner;

public class RepeatEx006_menu {
	public static void main(String args) {
		int num=-1;
		Scanner scanner=new Scanner(System.in);
		
		for(;;) {
			System.out.println("메뉴판입니다 9. 종료> ");
			num = scanner.nextInt();
			if(num==9) {break;}
		}
	}
}
