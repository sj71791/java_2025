package com.company.java007;

public class Repeat004 {
	public static void main(String [] args) {
		int [] arr= {1,2,3};
		for(int i=0; i<arr.length; i++) {
			System.out.print((i==0? "":",")+arr[i]);
		}
	}
}
