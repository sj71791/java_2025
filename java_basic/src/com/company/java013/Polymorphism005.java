package com.company.java013;
/*
         Object 
         	↑
          Papa int money=10000; sing()
            ↑
          Son2 int money=1500; sing()        
 */
class Papa extends Object{
	int money = 10000;
	public Papa() {super();}
	public void sing() {System.out.println("GOD-거짓말");}
}
class Son2 extends Papa{
	int money = 1500;
	public Son2() {super();}
	@Override public void sing() {System.out.println("빅뱅-거짓말");}
}

public class Polymorphism005 {
	public static void main(String[] args) {
		Papa mypapa = new Son2();
		// 부모는 자식을 담을 수 없다 /업캐스팅 / 타입캐스팅 불필요 
		//Q3. Papa mypapa 의미? {money=10000/sing()} 쓸수있게 해줄게!
		//Q4. 
		// mypapa = 1번지{money=1500 /"빅뱅-거짓말"}-{money=10000 /-----}
		System.out.println(mypapa.money); //10000
		mypapa.sing(); //빅뱅-거짓말
	}
}
