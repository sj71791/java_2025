package com.company.java016;

import java.util.ArrayList;
import java.util.Objects;

class UserInfo{
	private String name; private int age;
	public UserInfo() { super(); }
	public UserInfo(String name, int age) { super(); this.name = name; this.age = age; }
	@Override public String toString() { return "UserInfo [name=" + name + ", age=" + age + "]"; }
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
}
public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<UserInfo> users=new ArrayList();
		users.add(new UserInfo("아이언맨",50));
		users.add(new UserInfo("헐크",40));
		users.add(new UserInfo("캡틴",120));
		
//		for(int i=0; i<users.size(); i++) {
//		UserInfo u=users.get(i);
//		}
		for(UserInfo u:users) {System.out.println("이름: "+u.getName()+" / 나이: "+u.getAge());}
	
	}
	
/*
콜렉션프레임워크
- [배열]의 단점을 개선한 클래스 [객체]만 저장가능
- 저장공간의 크기를 [동적]으로 관리함

2.핵심 인터페이스 [3개: List Set Map]
- 인터페이스를 통해서 틀이 잡혀있는 방법으로
  다양한 컬렉션 클래스를 이용함.
 
List: ##5. 기차 인덱스여부[O], 중복허용여부 [O], [add get size remove contains]
Set : ##6. 주머니 인덱스여부[X], 중복허용여부 [X], [add 향상된for문/iterator size romove contains]
Map : ##7. 사전 [키:값] -  쌍(entry), [put get(key) size remove contains ]
 */
	
}
