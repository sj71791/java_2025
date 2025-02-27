package com.company.java009_ex;

//1. 클래스는 부품객체
//2. 클래스는 상태(멤버변수)와 행위(멤버함수)
import java.util.Scanner;

class MyPrice001{
	String name;  int price;
	void input() {
		Scanner scanner=new Scanner(System.in);
		System.out.print("상품이름 입력 > ");
		this.name=scanner.next();
		System.out.print("상품가격 출력 > ");
		this.price=scanner.nextInt();
	}
	void show() {
		System.out.println("\n상품정보입니다\n상품이름 : "+this.name+" / 상품가격 : "+this.price);
	}
}
public class ClassEx002 {
	public static void main(String[] args) {
		 MyPrice001   p1 = new MyPrice001();
	        p1.input();
	        p1.show();
	}
}
//클래스(설계도) - 인스턴스화(실제객체) - 객체(인스턴스들,,,)/인스턴스 p1.name
//출력내용 : 
//	  상품이름 입력 >  apple
//	  상품가격 출력 >  1500
//
//	  상품정보입니다
//	  상품이름 : apple  / 상품가격 : 1500