package com.company.java002;

public class Print001 {
	public static void main(String [] args) {
		//1. System.out.println()
		System.out.println("1. 줄바꿈");
		//2. System.out.print()
		System.out.print("2. 줄바꿈안됨 print");
		System.out.print("- 줄바꿈은 println 사용해야함.");
		
		//3. System.out.printf() %d 1,2  %f 1.23  %s "abc"
		System.out.printf("\n3. 정수 %d, 실수 %.2f, 문자열 %s\n",1, 1.2, "abc");
		
		//4. + 의미
		System.out.println(10+3); // 숫자+숫자
		System.out.println(10+3+"+"+1+2); //13+1(출력)2(출력)
		System.out.println(1+"+"+2+"="+3); //1+2=3
		
	}//end main
}//end class
