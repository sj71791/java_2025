package com.company.java016;
class Sawon005{
	int pay=10000;
	
	static int su=10;
	static int basicpay=pay; ////###000 static은 인스턴스를
	static int basicpay2;
	static {basicpay2=20000;}
	
	public static void showSu() {System.out.println(su);} ////###001
	public static void showPay() {System.out.println(this.pay);} ////###002
	
	public void showAll001() {////###003
		System.out.println(su);
		System.out.println(this.pay);
	}
	public static void showAll002() {////###004
		showAll011();
		System.out.println(this.pay);
	}
}
public class Class029 {
	public static void main() {
		Sawon005 sola=new Sawon005();
		sola.showAll001();
	}
}
