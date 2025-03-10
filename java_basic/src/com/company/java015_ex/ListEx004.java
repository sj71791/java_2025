package com.company.java015_ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Fruits{
	private int no; private String name; private  int price;

	public Fruits() { super(); }
	public Fruits(int no, String name, int price) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Fruits [no=" + no + ", name=" + name + ", price=" + price + "]";
	}
	public int getNo() { return no; }
	public void setNo(int no) { this.no = no; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getPrice() { return price; }
	public void setPrice(int price) { this.price = price; }
}
public class ListEx004 {
	public static void main(String[] args) {
		List<Fruits> fruits=new ArrayList();
		Scanner scanner=new Scanner(System.in);
		fruits.add(new Fruits(1, "apple" , 2000));
		fruits.add(new Fruits(2, "banana" , 2500));
		fruits.add(new Fruits(3, "coconut" , 4500));
		String [] fruitinfo = {"사과는 빨갛다" , "바나나는 노랗다" , "코코넛은 코코하다"};
		
		System.out.print("1,2,3 과일정보를 입력하시오. ");
		int num=scanner.nextInt();
		for(Fruits f:fruits) {
			if(f.getNo()==num) {
				System.out.println("번호: "+num+"\t이름: "+f.getName()+"\t가격: "+f.getPrice()+"\n"+fruitinfo[num-1]);
			}
		}
	}
}
