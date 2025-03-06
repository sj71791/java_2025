package com.company.java013;
/*
	Object	Object(){#3		}#4
	↑
	Parent	Parent(int i, int j){#2 i=10, j=20}#5
	↑
	Child	Child(10,20,30){#1  k=30}#6
 */
class Parent{
	int i, j;
	public Parent() {super();}  //1 Object()
	public Parent(int i, int j) { super(); this.i = i; this.j = j; }// 2 Object()
}  
class Child extends Parent{
	int k ;
	public Child() {super();}  //3 Parent()
	public Child(int i, int j,int k) { super(i,j); this.k = k; } //4 Parent(int i, int j)
}
public class ExtendsBasic007_Super {
	public static void main(String[] args) {
		Child child = new Child(10,20,30);
		System.out.println(child.i);  
		System.out.println(child.j);  
		System.out.println(child.k);  
	}
}
