package com.company.java008;

public class Repeat002 {
	public static void main(String [] args) {
		int num=100;
		for(int i=1; i<=3; i++) {
			System.out.print(num+" ");
			num+=100;
		}
		System.out.println();
		
		int i=1; num=100; while(i<4) {
			System.out.print(num+" ");
			num+=100;
			i++;
		}
		System.out.println();
		
		i=1; num=100; do {
			System.out.print(num+" ");
			num+=100;
			i++;
		}while(i<4);
	}
}
