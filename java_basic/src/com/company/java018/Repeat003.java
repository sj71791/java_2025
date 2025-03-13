package com.company.java018;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

class Dto{
	private int no; 
	private String name;
	private int age;
	public Dto() { super(); }
	public Dto(int no, String name, int age) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
	}
	@Override public String toString() { return "Dto [no=" + no + ", name=" + name + ", age=" + age + "]"; }
	public int getNo() { return no; }
	public void setNo(int no) { this.no = no; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
	
	
	
}
public class Repeat003 {
	public static void main(String[] args) {
		ArrayList<Dto> list=new ArrayList();
		HashSet<Dto> set=new HashSet();
		HashMap<Integer,Dto> map=new HashMap();
		
		//7
		list.add(new Dto(1,"iron",45));
		list.add(new Dto(2,"hulk",38));
		list.add(new Dto(3,"captain",120));
		Iterator<Dto> iter1=list.iterator();
		int total=0;
		System.out.println("======================\nNO\tName\tAge\n======================");
		while(iter1.hasNext()) {
			Dto a=iter1.next();
			total += a.getAge();
			System.out.println(a.getNo()+"\t"+a.getName()+"\t"+a.getAge());
		}
		System.out.println("총나이: " +total);
		System.out.println("평균나이: "+total/list.size());
		System.out.println(); System.out.println();
		
		//8
		set.add(new Dto(1,"iron",45));
		set.add(new Dto(2,"hulk",38));
		set.add(new Dto(3,"captain",120));
		Iterator<Dto> iter2=set.iterator();
		System.out.println("======================\nNO\tName\tAge\n======================");
		total=0;
		while(iter2.hasNext()) {
			Dto s=iter2.next();
			total+=s.getAge();
			System.out.println(s.getNo()+"\t"+s.getName()+"\t"+s.getAge());
		}
		System.out.println("총나이: " +total);
		System.out.println("평균나이: "+total/list.size());
		System.out.println(); System.out.println();

		//9
		map.put(1,new Dto(1,"iron",45));
		map.put(2,new Dto(2,"hulk",38));
		map.put(3,new Dto(3,"captain",120));
		System.out.println("======================\nNO\tName\tAge\n======================");
		total=0;
		Iterator<Entry<Integer,Dto>> iter3=map.entrySet().iterator(); //l. key=value
		while(iter3.hasNext()) { //2. 처리대상확인
			Entry <Integer,Dto> key_value=iter3.next();
			Dto d=key_value.getValue();
			total+=d.getAge();
			System.out.println(d.getNo()+"\t"+d.getName()+"\t"+d.getAge());
		}
		System.out.println("총나이: " +total);
		System.out.println("평균나이: "+total/list.size());
	}
}
/*
ㅁ 출력된결과
======================
NO	NAME	AGE
======================
1	iron	45
2	hulk	38
3	captain	120
*/