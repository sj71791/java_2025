package com.company.java011;

//class Cat2{}
//The type Cat2 is already defined	Modifier_protected.java 파일에서 작성함.
//package - default - 기본 - 같은폴더에서 사용가능
public class Modifier3_package {
	public static void main(String[] args) {
		Cat2 cat=new Cat2();
		//import 안해도 사용가능
		cat.public_=10;
//		cat.protected_=20; //cat2에서만 사용가능- extends 키워드 사용
//		cat.package_=30;
//		cat.Private_=40; //getters+setters
		cat.show();
	}
}
