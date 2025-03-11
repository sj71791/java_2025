package com.company.java016;

import java.util.InputMismatchException;

class A{
	int a; 				   //인스턴스 변수, heap area, new O, 실체화 this 각각
	static String company; //클래스 변수, method area, new X, 공용
	void method(){int a=0;}  //지역변수, stack area, 임시 ★주의사항 : 초기화
}

class Coffee012{
	String menu; int num,price;
	
	void show(){
		System.out.println("\n=====커피\n커피명: "+menu+"\n커피잔수: "+num+"\n커피가격: "+price);
	}
	
	//디폴트 생성자 1)생성자 오버로딩 2)상속
	public Coffee012() { this.menu="아메리카노"; this.num=2; this.price=2000; } 

	public Coffee012(String menu, int num, int price) {
		super();
		this.menu = menu;
		this.num = num;
		this.price = price;
	}
	
}
public class Coffee {
	public static void main(String[] args) {
		Coffee012 a1=new Coffee012("카페라떼", 2, 4000);
		a1.show();
		Coffee012 a2=new Coffee012();
		a2.show();
	}
}
