package com.company.java008_ex;

public class Array2Ex008 {
	public static void main(String[] args) {
		int [][]arr=new int[4][4];
		int num=1;
		for(int i=0; i<arr.length; i++) {
			num=1;
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j]=num; num++;
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
