package com.company.java007;

public class Repeat003 {
	public static void main(String [] args) {
		for(int i=1; i<=3; i++) {
			System.out.print(i*10+" ");
		}
		
		int i=1; while(i<=3) {
			System.out.print(i*10+" ");
			i++;
		}
		
		i=1; do {
			System.out.print(i*10+" ");
			i++;
		}while(i<=3);
	}
}
