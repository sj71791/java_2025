package com.company.java015_ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
class Userinfo2{
	private int no; private  String name; private  int age;
	public int getNo() { return no; }
	public void setNo(int no) { this.no = no; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
	@Override
	public String toString() {
		return "Userinfo2 [no=" + no + ", name=" + name + ", age=" + age + "]";
	}
	public Userinfo2(int no, String name, int age) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
	}
	public Userinfo2() { super(); }
	
	//set, Map 중복허용 1) hashCode 2) equals
	@Override public int hashCode() { return Objects.hash(no, name, age); } //1. 객체기반 생성확인
	@Override public boolean equals(Object obj) { //2. 객체안의 값이 같은지 확인
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Userinfo2 other = (Userinfo2) obj;
		return age == other.age && Objects.equals(name, other.name) && no == other.no;
	}
}
//Set 동적배열 - 주머니  index(X), 중복허용(X) / add, get(X), size, remove, contains
public class SetEx002 {
	public static void main(String[] args) {
		Set<Userinfo2> users=new HashSet<>();
		Scanner scanner=new Scanner(System.in);
		users.add(new Userinfo2(1, "아이언맨" , 50));
		users.add(new Userinfo2(2, "헐크" , 40));
		users.add(new Userinfo2(3, "캡틴" , 120));
		users.add(new Userinfo2(3, "캡틴" , 120));
		
		//4. 향상된 for / iterator 이용
		for(Userinfo2 u:users) {
			System.out.println(u.getNo()+"/"+u.getName()+"/"+u.getAge());
		}
		System.out.println();
		System.out.println();
		
		//iterator
		Iterator<Userinfo2> iter=users.iterator(); //1.모으기 iter→[1/아이언맨/1, 2/헐크/2]
		while(iter.hasNext()) {
			Userinfo2 u=iter.next();
			System.out.println(u.getNo()+"/"+u.getName()+"/"+u.getAge());
		}
		System.out.println("회원수 > "+ users.size()); //4명 --- 3명
		
		//5. 사용자들의 이름 입력받기
		System.out.print("원하는 유저 정보입력 > ");
		String name=scanner.next();
		
		//set에서 데이터 꺼내와 / 해당데이터의 이름과 입력한 값이 같다면/ 해당유저의 자료출력
		iter=users.iterator(); //1. 모으기
		while(iter.hasNext()) { //2. 처리대상확인
			Userinfo2 u=iter.next(); //3. 꺼내오기
			if(u.getName().equals(name)) {
				System.out.println(u.getNo()+"/"+u.getName()+"/"+u.getAge());
			}
		}//////값이 안나옴
	}
}
