package com.company.java007_ex;

public class Array2Ex005 {
	public static void main(String[] args) {
		int[][] arr = {
				   { 1, 1, 1,},
				   { 2, 2, 2,},
				   { 3, 3, 3,},
				   { 4, 4, 4,},
				 };
		int total=0;  double avg=0.0;
		for(int i=0; i<arr.length; i++) { //#1 층의정보
			for(int j=0; j<arr[0].length; j++) { //#2 칸의정보
				total+=arr[i][j];
			}
		}
		avg=(double)total/(arr.length*arr[0].length);
		System.out.println("총점 : "+total+"\n평균 : "+avg);
	}
}
