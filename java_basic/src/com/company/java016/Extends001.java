package com.company.java016;
class A1 extends Object{
	int a;
	public A1() { super(); }
	public A1(int a) { super(); this.a = a; }	
}
class B1 extends A1{
	int b;

	public B1() { super(); }
	public B1(int b) { this.b = b; }
	public B1(int a,int b) {super(a); this.b=b;}
}
class C1 extends B1{
	int c;
	public void showC() {
		System.out.println("상속받은 A클래스의 a "+a);
		System.out.println("상속받은 B클래스의 b "+b);
		System.out.println("상속받은 C클래스의 c "+c);
	}
}

public class Extends001 {
	public static void main(String[] args) {
		C1 myc=new C1();
		myc.a=10; myc.b=20; myc.c=30; myc.showC();
	}
}
