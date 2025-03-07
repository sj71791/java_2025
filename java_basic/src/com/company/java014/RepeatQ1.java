package com.company.java014;
class Parent{
	int x=100;
	void method() {System.out.println("Parent Method");}
}
class Child extends Parent{
	int x=200;
	void method() {System.out.println("Child Method");}
}
public class RepeatQ1 {
	public static void main(String[] args) {
		Parent p=new Child();
		//[x=100/method]
		Child c=new Child();
		//[x=200/method]-[x=100/method]
		System.out.println(p.x); //100
		p.method(); //Child Method
		// #1. 자식생성자호출시 #2. 부모생성자호출(부모인스턴스변수 청소 x=100)
		// #3. 같은 메서드가 있다면 자식 메서드로 오버라이드 @Override - 자식메서드 호출
		System.out.println(c.x); //200
		c.method(); //Child Method
	} 
}
