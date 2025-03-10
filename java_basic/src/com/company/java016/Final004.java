package com.company.java016;
class User004{
	char division; // A,B,C,D 
	String jumin;
	public User004(char division, String jumin) {
		super();
		this.division = division;
		this.jumin = jumin;
		return ;
	}
	public User004() {
		super();
	}
	@Override
	public String toString() {
		return "User004 [division=" + division + ", jumin=" + jumin + "]";
	}
	
	
	
}
public class Final004 {
	public static void main(String[] args) {
		User004 c1=new User004('B', "200101-1234567");	System.out.println(c1);
		User004 c2=new User004();	System.out.println(c2);
	}
}
