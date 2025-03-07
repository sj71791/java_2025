package com.company.java014_ex;

import java.util.Arrays;
import java.util.Calendar;

/* 연관관계
			   		<interface> 상수 : static final MONEY=10000
User		→		    Launch		  abstract     void eat();
				       ↑    ↑
				    Burger KimchiStew	
    
    
 */
interface Lounch{int MONEY=10000; void eat();}

class Burger implements Lounch{
	int price;
	public Burger() {this.price=3900;}
	@Override public void eat() { System.out.println("Buger 냠냠"); }
	@Override public String toString() { return "buger"; }
	
}
class KimchiStew implements Lounch{
	int price;
	public KimchiStew() {this.price=4000;}
	@Override public void eat() { System.out.println("kimchistew 냠냠"); }
	@Override public String toString() { return "KimchiStew"; }
}
class User{
	int money; int cnt;
	Lounch [] plate;
	User(){money=Lounch.MONEY; plate=new Lounch[3]; cnt=0;}
	
	void order(Lounch a) {
		//1. 주문한 메뉴의 값 확인
		int temp=0;
		if(a instanceof Burger) {
			System.out.println("버거하나요~"); temp = ((Burger)a).price;
		}
		if(a instanceof KimchiStew) {
			System.out.println("김치찌개하나요~"); temp = ((KimchiStew)a).price;
			}
		//2. 내가 가진돈 확인
		if(money<temp) {System.out.println("잔액이 부족해 더이상 주문이 불가능합니다."); return;}
		money-=temp;
		//plate에 주문받은거 넣기
		plate[cnt++]=a; //System.out.println(money+ "-" + Arrays.toString(plate));
		} //주문 버거하나요~ 김치..../ 잔액부족 주문불가능
	void show() {
		//System.out.println(Arrays.toString(plate));
		String order="주문 : ";
		for(int i=0; i<cnt; i++) { order+= ((i!=0)?",":" ")+ plate[i]; }
		System.out.println("\n\n"+ order);
		System.out.println("주문금액 : "+ (Lounch.MONEY-money));
		System.out.println("잔액 : "+money);
		
		Calendar today = Calendar.getInstance();
		System.out.println(today.get(1)+"년" + 		//년
						(today.get(2)+1)+"월" + 		//월
						today.get(5)+"일");			//일
		//java.lang.NullPointerException - 공간은 있으나 값이 없다
		//for(Lounch a:plate) {a.eat();} //부모에서 메서드 호출시 @Override- 자식메서드 호출
		for(int i=0; i<cnt; i++) {plate[i].eat();}
	}
}
public class InterfaceEx004 {
	public static void main(String[] args) {
		User Lounchorder=new User();
		Lounchorder.order(new Burger());	 
		Lounchorder.order(new KimchiStew()); //Lounch a=new KimchiStew() 부모=자식
		Lounchorder.order(new Burger());
		Lounchorder.show();
	}
}
