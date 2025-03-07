package com.company.java014;
/*
		object
		   ↑
		 Papa {money=10 }		/toString
		   ↑
		  Son {money=150 car=2} /toString
 */
class Papa{
	int money=10;
	public Papa() {}
	public Papa(int money) {this.money=money;}
	public String toString() {return "Papa[money="+money+"]";}
}
class Son extends Papa{
	int money=150;
	int car=2;
	public Son() {super();}
	public Son(int money) {this.money=money;}
	public Son(int money, int car) {this.money=money; this.car=car;}
	public String toString() { return "Son [money=" + money + ", car=" + car + "]"; }

}
public class Review_Multi {
	public static void main(String[] args) {
		Papa p1=new Papa();		//[money=1, toString] = 1번지 {money=10 / toString}
		System.out.println(p1); //Papa[money=10]
		
		Son s2=new Son();		//Son s2 [money=150,car=2/toString]-[money=10/toString]	
		System.out.println(s2); //Son [money=150, car=2]
		//s2 = 2번지 [money=150,car=2/toString]-[money=10/----]	
		
		//Son s3=new Papa();	//Son s3 [money=150,car=2/toString]-[money=10/toString]
		//s3 = 3번지											  Papa(){money=10/toString}
		// error
		
		Papa p4=new Son();		//[money=1, toString]
		System.out.println(p4); //Son [money=150, car=2]
		System.out.println(p4.money); // money10
		
		Papa p5=new Son(); 		//1. 부모=자식  /업캐스팅/타입캐스팅X
		Son s5=(Son)p5;			//2. 자식=부모  /다운캐스팅/타입캐스팅필요
		System.out.println(s5); // Son [money=150, car=2]
		//Son s5 [money=150,car=2/toString]-[money=10/toString]    
		//    p5 = 5번지 Son()[money=150,car=2/toString]-Papa()[money=10/-----]

/*
		Q8. 오버로딩은 메서드 이름은 같고 알규먼트 자료형과 개수를 다르게 하여 구분,
			오버라이딩은 상위클래스에서 선언한 메서드를 하위클래스에서 재정의 하여 사용하는 것 
			상속시 부모의 메서드를 자식에게 맞게 수정해서 사용
			
		Q9. abstract 란?
			추상화, 일반화, 공통의 기능 → IS A 고양이는 동물이다.
			
		Q10. interface 란?
			 실체화관계 → can do this! 약속할게,, 구현객체를 통해서 이서비스약속
		Q11. abstract와 interface 차이점?
			 공통점 : 자식클래스를 통해서 설계부분을 구현한다.
			 차이점 : abstract 일반클래스 + 설계도
			 		interface          설계도 추상화정도가 interface가 높다
			 		멤버변수는 public static final 이 붙은 상수
			 		멤버함수는 public abstract       abstract 메서드
 */ 
	}
}
