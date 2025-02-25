package com.company.java007_ex;

import java.util.Arrays;

public class Array2Ex006 {
	public static void main(String[] args) {
		int[][] datas = {  {  10, 10, 10 ,10}, 
	            {  20, 20, 20 ,20}, 
	            {  30, 30, 30 ,30},  
		};  // 3층 4칸 
		int[][] result = new int[datas.length+1][datas[0].length+1];
		
		//result 값 대입
		//#1
//		int sum1=0;
//		for(int i=0; i<datas.length; i++) {
//			sum1=0;
//			result[3][0]+=datas[i][0];
//			result[3][1]+=datas[i][1];
//			result[3][2]+=datas[i][2];
//			result[3][3]+=datas[i][3];
//			for(int j=0; j<datas[0].length; j++) {
//				result[i][j]=datas[i][j];
//				sum1+=datas[i][j];
//				result[i][4]=sum1;
//			}
//			result[3][4]+=result[i][4];
//		}
		//#2
		for(int ch=0; ch< datas.length; ch++) { //#1 층의 정보  ch<3
			for(int kan=0; kan<datas[ch].length; kan++) { //#2 칸의 정보  kan<4
				result[ch][kan] = datas[ch][kan];   //todo1. 데이터 복사해서 넣기
				result[ch][datas[ch].length] += result[ch][kan];  //todo2. 가로방향데이터 더하기
				result[datas.length][kan] += result[ch][kan]; //todo3. 세로방향데이터 datas.length  - 3  
				result[datas.length][datas[ch].length] += datas[ch][kan];// todo4. 총합
			}
		}// end 
		//출력
		System.out.println(Arrays.deepToString(result));
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result[0].length; j++) {
				System.out.print(result[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
//출력내용:
//10   10   10   10   40   
//20   20   20   20   80   
//30   30   30   30   120   
//60   60   60   60   240   

