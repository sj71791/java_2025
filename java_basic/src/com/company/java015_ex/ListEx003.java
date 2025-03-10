package com.company.java015_ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Userinfo{
	private String name; private int age;

	public Userinfo() { super(); }

	public Userinfo(String name, int age) { super(); this.name = name; this.age = age; }

	@Override
	public String toString() {
		return "Userinfo [name=" + name + ", age=" + age + "]";
	}

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
}
public class ListEx003 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		List<Userinfo> user=new ArrayList();
		user.add(new Userinfo("아이언맨" , 50));  
		user.add(new Userinfo("헐크" , 40)); 
		user.add(new Userinfo("캡틴" , 120));
		System.out.print("유저이름 입력 >");
		String name=scanner.next();
		
		for(int i=0; i<user.size(); i++) {
			if(user.get(i).getName().equals(name)) {
				System.out.println(user.get(i).getName()+","+user.get(i).getAge());
			}
		}
	}
}
