package com.company.java009;

public class Repeat004 {
	public static void main(String[] args) {
		char [] arr=new char[3];
		char te='a'; // char 저장시 숫자, 출력시 문자
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=te; te++;
			System.out.print((i==0? "값 : ":" ")+arr[i]);
		}
	}
}
