package com.company.java009_ex;

import java.util.Arrays;

public class MethodEx006 {
	public static void upper(char [] a) {
		for(int i=0; i<a.length; i++) {
			a[i]-=32;
		}
	}
	public static void main(String[] args) {
		char[] ch = {'a','b','c'};
	    upper(ch);   
	    System.out.println("main. 배열값 : "      +  Arrays.toString(ch)          ); //[A,B,C]
	}
}
