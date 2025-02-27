package com.company.java009;

public class Repeat003 {
	public static void main(String[] args) {
		//for  100 200 300
		for(int i=100; i<=300; i+=100) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//while  100 200 300
		int i=100; while(i<=300) {
			System.out.print(i+" ");
			i+=100;
		}
		System.out.println();
		
		//do while  100 200 300
		i=100; do {
			System.out.print(i+" ");
			i+=100;
		}while(i<=300);
	}
}
