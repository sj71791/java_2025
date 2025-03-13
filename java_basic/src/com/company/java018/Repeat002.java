package com.company.java018;
class Milk{
	private String name; private int price;

	public Milk() { this.name="white"; this.price=1300; }
	public Milk(String name, int price) { super(); this.name = name; this.price = price; }

	@Override public String toString() { return "출력된 결과 : " + name + " / " + price ; }
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getPrice() { return price; }
	public void setPrice(int price) { this.price = price; }
}
class MilkPrint {
	private String name; private int price;
	
	@Override public String toString() { return "MilkPrint [name=" + name + ", price=" + price + "]"; }

	public MilkPrint(String name, int price) { super(); this.name = name; this.price = price; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getPrice() { return price; }
	public void setPrice(int price) { this.price = price; }
	public MilkPrint() { super(); }

	void show(Milk []milks) {
		System.out.println("출력된 결과 :");
		for(Milk m:milks) {
			System.out.println(m.getName()+" / "+m.getPrice());
		}
	}
}
public class Repeat002 {
	public static void main(String[] args) {
		//클래스
		Milk m1 = new Milk("choco" , 1200);
		System.out.println( m1 );  // 출력된 결과 : choco / 1200
		Milk m2 = new Milk();
		System.out.println( m2 );  // 출력된 결과 : white / 1300
		System.out.println(); System.out.println();
		
		//클래스배열
		Milk []milks = new Milk[3];   		// milks = [null, null, null]
		milks[0] = new Milk("white",1000);
		milks[1] = new Milk("choco",1200);
		milks[2] = new Milk("banana",1500);
		MilkPrint  print = new MilkPrint();   
		print.show(  milks     );	
		// void show(Milk []milks);  // milks=[1번지, 2번지, 3번지]
		/* 출력된 결과 : 
		 * white  / 1000
		 * choco  / 1200
		 * banana / 1500 
		 */
	}
}
