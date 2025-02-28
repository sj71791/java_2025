package com.company.java010;

class Product{
	String name;
	int price;
	
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
		//alt +shift + s(밑에서-2,3,4번)
	}
	public Product() {
		System.out.println("원하는 값으로 초기화-수동생성시 컴파일러 자동생성 취소");
		// String 문자열은 null로 초기화 / int 0으로 초기화
	}
	@Override public String toString() {return "Product [name=" + name + ", price=" + price + "]";}
	//@override - 자식클래스(Product)에 맞게 수정 - 값 출력
}

public class Class004_Construntor {
	public static void main(String[] args) {
		Product p1=new Product();
		System.out.println(p1);
	}

	public Class004_Construntor() {
		super();
		// TODO Auto-generated constructor stub
	}
}
/*
------------------------------------  [runtime data area]
[method] Product.class, Class004.class #1
------------------------------------
[heap:동적]      |[stack:잠깐빌리기]
 1번지:{name=null, price=0} <- p1
                |main #2
------------------------------------
*/