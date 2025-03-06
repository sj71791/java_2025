package com.company.java012;
class Color extends Object{
	private String name;

	public Color() { super(); }

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
}
class Green extends Color{
	private int num;

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Green() { super(); }
	public void show(){System.out.println("::::: GREEN\n= NAME : "+getName()+"\n= NUM  : "+getNum());}
	
}

public class Extends002 {
	public static void main(String [] args) {
		Green mygreen = new Green();
		mygreen.setName("LIGHT_GREEN");
		mygreen.setNum(5);
		mygreen.show();
	}
}
