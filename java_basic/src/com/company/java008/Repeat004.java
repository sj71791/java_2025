package com.company.java008;

public class Repeat004 {
	public static void main(String [] args) {
		int[][] arr2=new int[2][3];
		int num=0;
		for(int i=0; i<arr2.length; i++) {
			num+=10;
			for(int j=0; j<arr2[0].length; j++) {
				arr2[i][j]=num;
				num+=10;
			}
		}
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[0].length; j++) {
				System.out.print(arr2[i][j]+"\t");;
			}
			System.out.println();
		}
	}
}
