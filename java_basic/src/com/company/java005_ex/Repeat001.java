package com.company.java005_ex;

import java.util.Scanner;

public class Repeat001 {
	public static void main(String [] args) {
		int a; String st="";
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("숫자 입력 > ");
		a=scanner.nextInt();
		
		if(a==1) {st="1이다";}
		else if(a==2) {st="2이다";}
		else if(a==3) {st="3이다";}
		 
		System.out.println(st);
	}
	
}
