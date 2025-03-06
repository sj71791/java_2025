package com.company.java012;

/*
	object			object
	   ↑			  ↑
	TestA (int a)   TestB (int b)
*/
class TestA extends Object{int a;}
class TestB extends Object{int b;}
public class Poly001 {
	public static void main(String[] args) {
		TestA v110= new TestA();
		//TestB v220=v110; 
		//Type mismatch: cannot convert from TestA to TestB
		//클래스도 자료형( 틀 - Object)
	}
}
