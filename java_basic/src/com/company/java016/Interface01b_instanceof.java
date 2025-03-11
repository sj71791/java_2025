package com.company.java016;

/*
abstract와 interface의 공통점과 차이점
공통점 : 자손객체를 통해서 코드를 구현한다.
차이점 : interface가 추상화정도가 더 크다
		abstract  - 인스턴스변수, 인스턴스메서드 사용가능
		interface - 상수 		, abstract 메서드
*/
interface Vehicle1b{public void run();}

class MotorCycle1b implements Vehicle1b{
	@Override public void run() {
		System.out.println("오토바이가 달립니다");
	}
	public void helmet() {System.out.println("헬멧을 착용합니다");}
}
class Car1b implements Vehicle1b{

	@Override
	public void run() {
		System.out.println("자동차가 달립니다.");
	}
}
class Drive1b{
	void drive(Vehicle1b a) {
		a.run(); 
		if(a instanceof MotorCycle1b) { ((MotorCycle1b)a).helmet(); }
	}
}

public class Interface01b_instanceof {
	public static void main(String[] args) {
		Drive1b drive1b=new Drive1b();
		MotorCycle1b motor=new MotorCycle1b();
		Car1b car=new Car1b();
		drive1b.drive(car);
		System.out.println("\n\n>>자동차가 고장나서 교통수단을 바꿉니다!");
		drive1b.drive(motor);
	}
}