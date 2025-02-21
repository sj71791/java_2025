package com.company.java005_ex;

public class ForEx004 {
	public static void main(String [] args) {
		int sum=0;
		System.out.print("3의배수: ");
		for(int i=1; i<=10; i++) {
//			if(i%3==0 && i!=9) {
//				System.out.print(i+",");
//				sum+=1;
//			}
//			if(i==9) {
//				System.out.print(i+"\n");
//				sum+=1;
//			}
			if(i%3==0) {
				sum++;
				System.out.print(i+(i==9? "":","));
			}
				
		}
		System.out.println("\n갯수: "+sum);
	}
}
