package com.company.java007_ex;

import java.util.Arrays;

public class ArrayEx007 {
	public static void main(String[] args) {
		char[] arr=new char[5];
		char ch='A';
		for(int i=0; i<arr.length; i++) {
			arr[i]=ch;
			ch++;
		}
		System.out.println(Arrays.toString(arr));
	}
}
