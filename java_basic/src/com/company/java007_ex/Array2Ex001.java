package com.company.java007_ex;

import java.util.Arrays;

public class Array2Ex001 {
	public static void main(String[] args) {
		//이중for 이용해서 출력하기(1)
		int[][] arr2= {{100,200,300},{400,500,600}};
		System.out.println(Arrays.deepToString(arr2));
		System.out.println("층의 갯수 : "+arr2.length);
		System.out.println("칸의 갯수 : "+arr2[0].length);
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr2[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
