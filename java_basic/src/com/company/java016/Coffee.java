package com.company.java016;

import java.util.InputMismatchException;

class A{
	int a; 				   //인스턴스 변수
	static String company; //클래스 변수
	void method(){int a;}  //지역변수
}

class Coffee012{
	String menu; int num,price;
	
	void show(){
		System.out.println("메뉴: "+menu+"\t주문한 잔수: "+num+"\t가격: "+price);
	}

	public Coffee012() { super(); }

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
