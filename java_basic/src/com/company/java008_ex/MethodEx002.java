package com.company.java008_ex;

public class MethodEx002 {
	public static void test1(int a) {System.out.println(a);}
	public static void test2(double a) {System.out.println(a);}
	public static void hap(int a, int b) {
		int sum=0;
		for(int i=a; i<=b; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	public static void disp(int a, char b) {
		for(int i=0; i<a; i++) {
			System.out.print(b);
		}
	}
	
	public static void main(String[] args) {
		test1(10);
		test2(1.2);
		hap(3,5);
		disp(7,'*');
	}
}
