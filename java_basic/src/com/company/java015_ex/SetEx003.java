package com.company.java015_ex;

import java.util.HashSet;
import java.util.Set;

public class SetEx003 {
	public static void main(String[] args) {
		Set<Integer> lotto = new HashSet<>();
		System.out.println("1. 랜덤: 0~0.99999        >"+Math.random()); 
		System.out.println("2. *45: 0*45 ~0.99999*45 >"+Math.random()*45); //0~44.9999
		System.out.println("3. 소수점떼기               >"+(int)(Math.random()*45)); //0~44
		System.out.println("4. +1                   >"+((int)(Math.random()*45)+1)); //1~45
		
		//(int)(Math.random() * 원하는 갯수)+1
		lotto.add((int)(Math.random()*45)+1);
		
		while(lotto.size()<6) { //6개보다 적으면 추가
			lotto.add((int)(Math.random()*45)+1);
		}
		System.out.println(lotto);
	}
}
/*
동적배열 - 객체만 저장
List - 기차 : index(O), 중복허용(O)
Set - 주머니 : index(X), 중복허용(X)
Map 
*/