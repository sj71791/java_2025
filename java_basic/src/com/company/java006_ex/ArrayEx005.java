package com.company.java006_ex;

public class ArrayEx005 {
	public static void main(String[] args) {
		int sum1=0, sum2=0, alp; 
		char [] ch={'B' , 'a' , 'n' , 'a', 'n' , 'a'};
		for(int i=0; i<ch.length; i++) {
			if(ch[i]>='A' && ch[i]<='Z') {
				sum1+=1;
				alp = ch[i]+32;
				System.out.print((i==0? "":",")+(char)alp);
			}
			if(ch[i]>='a' && ch[i]<='z') {
				sum2+=1;
				alp=ch[i]-32;
				System.out.print(","+(char)alp);
			}
		}
		System.out.println("\n대문자의 갯수는 "+sum1+"\n소문자의 갯수는 "+sum2);
	}
}
