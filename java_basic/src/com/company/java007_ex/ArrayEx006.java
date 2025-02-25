package com.company.java007_ex;

import java.util.Arrays;

public class ArrayEx006 {
	public static void main(String[] args) {
		double[] arr=new double[5];
		double dou=1.1;
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=dou;
			dou+=0.1;
			System.out.print(String.format("%.1f", arr[i])+"\t");
		}
		
	}
}
