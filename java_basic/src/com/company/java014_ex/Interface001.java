package com.company.java014_ex;
interface Animal{
	String Name="홍길동";
	void eat();
}
class Saram implements Animal{

	@Override public void eat() { System.out.println(Name+"이 밥을 먹어요"); }	
}
class Dog implements Animal{

	@Override public void eat() { System.out.println(Name+"이 밥을 먹어요"); }	
}
class Alpha extends Dog{

	@Override public void eat() { System.out.println(Name+"이 밥을 먹어요.");}
}
public class Interface001 {
	public static void main(String[] args) {
		Animal ani=null;
		ani=new Saram(); ani.eat();
	}
}
