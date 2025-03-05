package com.company.java012;
class Grand extends Object{
	public void one(){System.out.println("Grand: one");}
	public void two(){System.out.println("Grand: two");}
}
class Aunt extends Object{
	String name="MiMi";
	@Override public String toString() {return name +"옆집이모";}
}
class Father extends Grand{
	public void three(){System.out.println("Father: three");}
}
class Uncle extends Grand{
	public void four(){System.out.println("Uncle: four");}
	public void one(){System.out.println("Uncle: one");}
	public void two(){System.out.println("Uncle: two");}
}
public class Extends004 {
	public static void main(String[] args) {
		Father father=new Father(); father.three(); father.two(); father.one();
		Uncle uncle=new Uncle(); uncle.two(); uncle.one();
		Aunt aunt=new Aunt();
		System.out.println(aunt.toString()); System.out.println(aunt);
		
		//Uncle uncle=new Uncle(); uncle.four(); uncle.two(); uncle.one(); //본인께 없으면 부모클래스에서 사용
		//↑ object(){#3 }#4 객체틀 만들고
		//↑ Grand(){#2 }#5 one(),two()           override: 부모클래스외 같은 메서드 재정의
		//↑ Uncle(){#1 }#6 four(), one(),two()   우선순위 - 자식메서드(내꺼) 우선
	}
}
