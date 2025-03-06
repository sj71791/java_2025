package com.company.java013;

public class TestArr {
	public static void main(String[] args) {
		A [] arr = new A[3]; // arr[null, null, null]
		arr[0] = new A(); arr[1]=new A(); arr[2]=new A();
		//주의사항!)생성자를 호출해 인스턴스변수를 사용가능하게 만들어야함
		for(A one:arr) {System.out.println(one);} //향상된 for문
	}
}
