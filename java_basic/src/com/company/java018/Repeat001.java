package com.company.java018;
class TestA2{
	int  a = 10;
	public TestA2() { super();  }
	@Override public String toString() { return "TestA2 [a=" + a + "]"; }
}
class TestB2 extends  TestA2{ 
	int b=20;
	public TestB2() { super();  }
	@Override public String toString() { return "TestB2 [b=" + b + "]"; }
}
public class Repeat001 {
	public static void main(String[] args) {  
		// 다형성
		TestA2   ta = new TestA2();    // [ ta   [a]  ]
		//TestB2   tb = ta;              // [ tb   [b]-[a]  ]
		// 오류나는 이유는? 
		//{b=20 / toString} - {a=10 / toString} tb = 1번지 {a=10 / toString}
		//{b=20 / toString} 부분을 사용할 수 없음
		//5-3 해결방안
		ta = new TestB2(); 
		TestB2 tb=(TestB2) ta;
		// 자식 = 부모 / 다운캐스팅 / 타입캐스팅O - 부모는 자식생성자를 호출한 적이 있어야 한다.
	}
}
