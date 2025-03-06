package com.company.java011;

import com.company.java011_ex.Cat;

public class Modifier1_public {
	public static void main(String[] args) {
		Cat cat=new Cat();
		cat.public_=10; //public은 아무데서나 접근가능
//		cat.protected_ 안보임 The field Cat.protected_ is not visible
//		cat.package_   안보임 The field Cat.package_ is not visible
//		cat.private_   안보임 The field Cat.private_ is not visible
		cat.setPrivate_(100);
		System.out.println(cat.public_+"/"+cat.getPrivate_());
		//private은 getter+setter를 이용
	}
}
