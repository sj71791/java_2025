package com.company.java004_ex;

import java.util.Scanner;

public class SwitchEx001 {
	public static void main(String [] args) {
		int a; String st="";
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("몇월? > ");
		a=scanner.nextInt();
		
		switch(a) {
		case 3: case 4: case 5: st="봄이다"; break;
		case 6: case 7: case 8: st="여름이다"; break;
		case 9: case 10: case 11: st="가을이다"; break;
		case 12: case 1: case 2: st="겨울이다"; break;
		}
		System.out.println(st);
	}
}
