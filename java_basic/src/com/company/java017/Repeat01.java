package com.company.java017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Objects;

class Milk{
	private int no; private String name; private int price;

	public Milk() { super(); }

	public Milk(int no, String name, int price) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Milk [no=" + no + ", name=" + name + ", price=" + price + "]";
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, no, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Milk other = (Milk) obj;
		return Objects.equals(name, other.name) && no == other.no && price == other.price;
	}
	static void print() {
		System.out.println("================================\nNO\tNAME\tPRICE\n================================");
	}
}
public class Repeat01 {
	public static void main(String[] args) {
		ArrayList<Milk> m1= new ArrayList();
		HashSet<Milk> m2=new HashSet();
		HashMap<Integer, Milk> m3=new HashMap();
		
		m1.add(new Milk(1,"white",1000));
		m1.add(new Milk(2,"choco",1200));
		m1.add(new Milk(3,"banana",1300));
		Milk.print();
//		for(int i=0; i<3; i++) {
//			System.out.println(m1.get(i));
//		} System.out.println();
		Iterator<Milk> iter0=m1.iterator();
		while(iter0.hasNext()) {
			Milk m=iter0.next();
			System.out.println(m.getNo()+"\t"+m.getName()+"\t"+m.getPrice());
		}
		
		m2.add(new Milk(1,"white",1000));
		m2.add(new Milk(2,"choco",1200));
		m2.add(new Milk(3,"banana",1300));
		Milk.print();
		Iterator<Milk> iter1=m2.iterator();
		while(iter1.hasNext()) {
			Milk m=iter1.next();
			System.out.println(m.getNo()+"\t"+m.getName()+"\t"+m.getPrice());
		} System.out.println();
		
		m3.put(1, new Milk(1,"white",1000));
		m3.put(2, new Milk(2,"choco",1200));
		m3.put(3, new Milk(3,"banana",1300));
		Milk.print();
		Iterator<Integer> iter2=m3.keySet().iterator();
		Iterator<Entry<Integer, Milk>> iter3=m3.entrySet().iterator();
		while(iter3.hasNext()) {
			Entry <Integer,Milk> key_value = iter3.next();
			System.out.println(key_value.getKey());//1
			System.out.println(key_value.getValue()); //Milk [no=1...]
			Milk temp=key_value.getValue();
			System.out.println(temp.getNo()+"\t"+temp.getName()+"\t"+temp.getPrice());
					
		}
//		while(iter2.hasNext()) {
//			int i=iter2.next();
//			System.out.println(m3.get(i));
//		}
	}
}
