package com.company.java003_ex;

import java.util.Scanner;

public class OperatorEx001 {
	public static void main(String [] args) {
		int a=3, b=10;
		System.out.println(b+=10 - a--);
		//1) a-- 
		//2) 10-a
		//3) b+=2
		//4) ); 후 --
		System.out.println(a+=5);
		//1) a+=5    2+=5   7
		System.out.println(a>=10 || a<0 && a>3);
		//() 값 비교(>.<) 조건(&&)대입
		//       츄(>.<)    &&,||
		//1) a>=10           a<0  a>3
		//	 7>=10           7<0  7<3
		//   false           false && true && 우선순위 높음
		//   false    ||     false
		//2) false
	}
}
