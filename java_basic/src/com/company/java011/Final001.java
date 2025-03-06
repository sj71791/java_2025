package com.company.java011;
//final 변경하지마
//부품객체(멤버변수+멤버함수)

//4.final class FinalEx extends object{상속받지마 
class FinalEx extends Object{ //object- 자바팀이 객체틀 만들어놓음! 2. extends 상속(앞에 객체 그대로 사용)
//	static String tree="4-5";//식목일 - 나무심는날 기념일
	final static String tree="4-5"; //3-3. static final 주로같이 사용됨.
	String name;
	
	final void show() {System.out.println(FinalEx.tree + "/" + name);}
}

class MyDate extends FinalEx{

//	@Override
//	void show() {
//		// TODO Auto-generated method stub
//		super.show();
//	} //5. 오버라이드 자식클래스에서 메서드재수정
	
}

public class Final001 {
	public static void main(String[] args) {
//		FinalEx.tree="4-6"; //3-2. static 공용,,, 아래에서 변경가능
							//3-4. final 변경이 안되값 - cannot be assigned
		System.out.println("식목일 - 나무심는 날, 기념일(공유,변경안되는값) > "+FinalEx.tree);
	}
}
