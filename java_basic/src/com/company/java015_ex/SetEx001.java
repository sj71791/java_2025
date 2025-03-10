package com.company.java015_ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx001 {
	public static void main(String[] args) {
		Set<String> colors=new HashSet<>();
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		colors.add("green");
		
		//향상된 for
		for(String c: colors) {System.out.println(c);}
		
		//2.iterator
		Iterator<String> iter=colors.iterator(); //1.set요소들 모으기
		while(iter.hasNext()) { //2. 처리대상 확인
			System.out.println(iter.next()); //3. 객체요소한개 꺼내오기
		}
		
		System.out.println(colors.size()); //3개
	}
}
