package com.company.java006_ex;

public class ArrayEx004 {
	public static void main(String[] args) {
		int sum=0;
		char [] ch= {'B' , 'a' , 'n' , 'a', 'n' , 'a'};
		for(int i=0; i<ch.length; i++) {
			if(ch[i]=='a') {
				sum+=1;
			}
		}
		System.out.println("char배열 속 a의 개수는 "+sum);
	}
}
