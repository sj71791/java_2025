package com.company.java005_ex;

public class ForEx005 {
	public static void main(String [] args) {
		int sum1=0, sum2=0;
		System.out.print("3의배수는 ");
		for(int i=1; i<=10; i++) {
//			if(i%3==0 && i!=9) {
//				System.out.print(i+",");
//				sum1+=1;
//			}
//			if(i==9) {
//				System.out.print(i+"\n");
//				sum1+=1;
//			}
			
			if(i%3==0) {
				System.out.print((i==3 ?"":",")+i);
				sum1++;
			}
		}
		System.out.println("\n3의배수 갯수(1~10): "+sum1);
		
		System.out.println();
		for(int i='a'; i<='z'; i++) {
//			if(i==97 || i==101 || i==105 || i==111) {
//				sum2+=1;
//				System.out.print((char)i+",");
//			}
//			if (i==117) {
//				sum2+=1;
//				System.out.print((char)i);
//			}
			if(i=='a' || i=='e' || i=='i' || i=='o' || i=='u') {
				sum2++;
				System.out.print((i=='a' ?"모음은 ":",")+(char)i);
			}
		}
		System.out.println("\n모음의 갯수: "+sum2);
	}
}
