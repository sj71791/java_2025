package com.company.java010_ex;
class Mobile2{  
    String   serialNo;  // 인스턴스변수 - heap area - new O - this (각각)
    static  int count=0;  // 클래스변수 - method - new X - static (공용) - 바로사용가능
    Mobile2(){this.serialNo="2030-"+ ++count; }
//    static void plus() {count+=4;}
} 

public class StaticEx002 {
	public static void main(String[] args) {
		Mobile2 m1 = new Mobile2(); //1. new 공간빌리기  2. 생성자()  3. 번지
		   Mobile2 m2 = new Mobile2(); 
		   Mobile2 m3 = new Mobile2();  
		   Mobile2 m4 = new Mobile2();
//		   m4.plus();
//		   m1.serialNo="2030-1";
//		   m2.serialNo="2030-2";
//		   m3.serialNo="2030-3";
//		   m4.serialNo="2030-4";
		   System.out.println("모바일 갯수는 모두 "+ Mobile2.count +"개 입니다.");   
		   System.out.println("m1의 제품번호 " + m1.serialNo);  //1
		   System.out.println("m2의 제품번호 " + m2.serialNo);  //2
		   System.out.println("m3의 제품번호 " + m3.serialNo);  //3
		   System.out.println("m4의 제품번호 " + m4.serialNo);  //4

	}
}
//출력된결과:
//모바일 갯수는 모두 4개 입니다.
//m1의 제품번호 2030-1
//m2의 제품번호 2030-2
//m3의 제품번호 2030-3
//m4의 제품번호 2030-4
