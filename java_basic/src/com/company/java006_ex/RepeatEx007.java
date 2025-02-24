package com.company.java006_ex;

public class RepeatEx007 {
	public static void main(String [] args) {
		// 1 2 3 4 5
		for(int i=1; i<=5; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		int i=1; while(i<=5) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		
		i=1; do {
			System.out.print(i+" ");
			i++;
		}while(i<=5); System.out.println();
			
		// 5 4 3 2 1
		for(int j=5; j>0; j--) {
			System.out.print(j+" ");
		} System.out.println();
		
		int j=5; while(j>=1) {
			System.out.print(j+" ");
			j--;
		} System.out.println();
		
		j=5; do {
			System.out.print(j+" ");
			j--;
		}while(j>0); System.out.println();
		
		//JAVA1 JAVA2 JAVA3
		for(int k=1; k<4; k++) {
			System.out.print("JAVA"+k+" ");
		} System.out.println();
		int k=1; while(k<4) {
			System.out.print("JAVA"+k+" ");
			k++;
		} System.out.println();
		k=1; do{
			System.out.print("JAVA"+k+" ");
			k++;
		} while(k<4);
	}
}
