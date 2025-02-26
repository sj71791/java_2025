package com.company.java008;

public class Repeat003 {
	public static void main(String [] args) {
		int[] arr=new int[3];
		int num=10;
		for(int i=0; i<arr.length; i++) {
			arr[i]=num;
			num+=10;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print((i==0? "":",")+arr[i]);
		}
	}
}
