package com.company.java005_ex;

public class ForEx001 {
	public static void main(String [] args) {
		// 1) 12345
		for(int i=1; i<=5; i++) {
			System.out.print(i+" "); 
		}
		System.out.println();
		
		// 2) 54321
		for(int i=5; i>=1; i--) {System.out.print(i+" ");} System.out.println();
		
		// 3) JAVA1 JAVA2 JAVA3
		for(int i=1; i<=3; i++) {System.out.print("JAVA"+i+"\t");} System.out.println();
		
		// 4) HAPPY3   HAPPY2  HAPPY1
		for(int i=3; i>=1; i--) {System.out.print("HAPPY"+i+"\t");} System.out.println();
		
		// 5) 0,1,2
		//5-1
		for(int i=0; i<=2; i++) {
			if(i==2) {
				System.out.print(i); break;
			}
			System.out.print(i+",");} 
		System.out.println();
		//5-2 (삼항연산 적용)
		for(int i=0; i<=2; i++) {System.out.print((i==0 ?"":",")+i);}
		System.out.println();
		
		// 6) 0,1,2, ,,,중간생략 ,,, 99
		for(int i=0; i<=99; i++) {
			if(i==99) {
				System.out.print(i); break;
			}
			System.out.print(i+",");} 
		System.out.println();
		
		// 7) 10, 9,,,,중간생략 ,,, , 1 
		for(int i=10; i>=1; i--) {
			if(i==1) {
				System.out.print(i); break;
			}
			System.out.print(i+", ");} 
		System.out.println();
		
		// 8) 0, 2, 4, 6, 8
		for(int i=0; i<=8; i+=2) {
			if(i==8) {
				System.out.print(i); break;
			}
			System.out.print(i+", ");} 
		System.out.println();
		
		// 9) 0, 2, 4, 6, 8 ,,,중간생략 ,,, 18 
		for(int i=0; i<=18; i+=2) {
			if(i==18) {
				System.out.print(i); break;
			}
			System.out.print(i+", ");} 
		System.out.println();
	}
}
