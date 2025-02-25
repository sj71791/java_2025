package com.company.java007_ex;

public class Array2Ex004 {
	public static void main(String[] args) {
		//for + length 이용해서 대입 & for + length 이용해서 출력
		//A   B   C
		//B   C   D
		char [][] arr=new char[2][3];
		
		char te='A';
		for(int kan=0; kan<arr[0].length; kan++) {
			arr[0][kan]=te;
			te++;
		}
		te='B';
		for(int kan=0; kan<arr[1].length; kan++) {
			arr[1][kan]=te;
			te++;
		}
		for(int ch=0; ch<arr.length; ch++) {
			for(int kan=0; kan<arr[0].length; kan++) {
				System.out.print(arr[ch][kan]+"\t");
			}
			System.out.println();
		}
		
		
	}
}
