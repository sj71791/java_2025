package com.company.java014;
//설계목적
interface Animal{
	String NAME="홍길동"; //1.public static final 상수- method area
	void eat();			//2. public abstract 추상메서드 {}
}
class Saram implements Animal{
	@Override public void eat(){
		//NAME="아이유";  error1 변하지 않는 상수! 
		System.out.println(NAME+"이 밥을 먹어요.");
	}
}
public class Interface001_basic {
	public static void main(String[] args) {
		//Animal ani = new Animal();  //error2 new{} 구현부가 없어서 new 사용불가
		Animal ani = null;
		ani = new Saram(); ani.eat();
	}
}
