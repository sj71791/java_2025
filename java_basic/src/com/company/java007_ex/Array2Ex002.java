package com.company.java007_ex;

public class Array2Ex002 {
	public static void main(String[] args) {
		//이중for 이용해서 출력하기(2)
		 int[][] arr2={{101,102,103},{201,202,203}};
		 for(int i=0; i<2; i++) {
			 for(int j=0; j<3; j++) {
				 System.out.print(arr2[i][j]+"\t");
			 }
			 System.out.println();
		 }
	}
}
