package com.company.java009;

import java.util.Arrays;

public class Repeat005 {
	public static void main(String[] args) {
		char [][] arr2=new char[2][3];
		char te='a';
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[0].length; j++) {
				arr2[i][j]=te++;
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(Arrays.deepToString(arr2));
	}
}
