package com.company.java016;
class Sawon005{
	int pay=10000; //인스턴스변수
	
	static int su=10; //클래스변수
	//static int basicpay=pay; ////###000 클래스(static)는 인스턴스사용불가
	static int basicpay2; //클래스변수
	static {basicpay2=20000;}
	
	public static void showSu() {System.out.println(su);} ////###001
	//public static void showPay() {System.out.println(this.pay);} ////###002 static은 인스턴스를 불러올 수 없음
	
	public void showAll001() {////###003
		System.out.println(su);
		System.out.println(this.pay);
	}
	public static void showAll002() {////###004
		//showAll011(); // static 메서드는 인스턴스 메서드를 불러올 수 없음
		//System.out.println(this.pay); // static 메서드는 불러올 수 없음 
	}
}
public class Class029 {
	public static void main() {
		Sawon005 sola=new Sawon005();
		sola.showAll001();
	}
}
