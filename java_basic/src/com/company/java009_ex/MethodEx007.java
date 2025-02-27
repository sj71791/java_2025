package com.company.java009_ex;

import java.util.Arrays;
import java.util.Scanner;

public class MethodEx007 {
	public static void who_are_you(String [][] a){
		Scanner scanner=new Scanner(System.in);
		System.out.print("아이디를 입력해주세요 > ");
		String inid=scanner.next();
		for(int i=0; i<a.length; i++) {
			if(a[i][0].equals(inid)) {System.out.println(inid+"는 "+a[i][2]+"사람입니다.");}		
		}
	}
	public static void who_pass_change(String [][] a){
		Scanner scanner=new Scanner(System.in);
		System.out.print("아이디를 입력해주세요 > ");
		String inid=scanner.next();
		System.out.print("비밀번호를 입력해주세요 > ");
		String inpw=scanner.next();
		int idc=0;
		int pwc=0;
		for(int i=0; i<a.length; i++) {
			if(a[i][0].equals(inid)) {
				idc=1;
				if(a[i][1].equals(inpw)) {pwc=1;}
			}else {continue;}
			if(idc==1 && pwc==1) {
			System.out.print("변경하실 비밀번호를 입력해주세요 > ");
			a[i][1]=scanner.next();
			System.out.println("정보확인 : "+Arrays.toString(a[i]));
			break;
			}else {System.out.println("유저를 확인해주세요!");}
//			idc=0; pwc=0;
		}
	}

	public static void main(String[] args) {
		
		//String [][] idm=[3][3];
		//String [][] idpw=[3][3];
		
		

		// 변수
		String [][] users = {{ "aaa"  , "111"   , "한국"     } ,     // 00 01 02
		                     { "bbb" , "222"   , "호주"       } ,       // 10 11 12
		                     { "ccc"  , "333"   , "중국"      }};      // 20 21 22
		// 입력
		who_are_you(users);   
		who_pass_change(users); 
		
	}
}
