package com.company.java016_ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
class UserInfo{
	private String name; private int age;
	public UserInfo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public UserInfo() { super(); }
	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserInfo other = (UserInfo) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
}
public class MapEx002 {
	public static void main(String[] args) {
		Map<Integer, UserInfo> map=new HashMap();
		map.put(  1,  new UserInfo("아이언맨"    , 50) );  // 1 넣어도 Integer( 클래스, 객체 )
		map.put(  2,  new UserInfo("헐크"       , 40) );  // wrapper 클래스
		map.put(  3,  new UserInfo("캡틴"       , 120) ); // boxing
		map.put(  1,  new UserInfo("아이언맨-new", 50) ); 
		
//		int a=1; //기초값 - 객체의 기능사용 불가
//		Integer e=1; //객체 - 객체 기능사용 가능	객체 = 기초값 - boxing - wrapper클래스
//		System.out.println(a+"/"+e.byteValue());
		
		//향상된for1
		for(Integer key:map.keySet()) {System.out.println(key+"/"+map.get(key));}
		System.out.println();
		System.out.println();
		
		//향상된for2
		for(Entry<Integer, UserInfo> m:map.entrySet()) {
			System.out.println(m.getKey()+"/"+m.getValue());
		}
		System.out.println();
		System.out.println();
		
		//keySet
		Iterator<Integer> iter=map.keySet().iterator(); //iter → [1,2,3] 1.모으기
		while(iter.hasNext()) {//처리대상확인
			Integer key=iter.next();
			System.out.println(key+": "+map.get(key));
		}
		System.out.println();
		System.out.println();
		
		//entrySet
		 Iterator<Entry <Integer, UserInfo>> eter =map.entrySet().iterator();
		 while(eter.hasNext()) {
			 Entry <Integer,UserInfo> temp=eter.next();
			 System.out.println(temp.getKey()+"/"+temp.getValue());
		 }
	}
}
