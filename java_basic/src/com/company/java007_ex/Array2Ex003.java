package com.company.java007_ex;

import java.util.Arrays;

public class Array2Ex003 {
	public static void main(String[] args) {
		int [][] arr=new int[2][3];
		int num=101;
		for(int ch=0; ch<arr.length; ch++) {
			for(int kan=0; kan<arr[0].length; kan++) {
				arr[ch][kan]=num;
				num++;
			} //for end
		} //for end
		
		System.out.println(Arrays.deepToString(arr));
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
