package com.company.java016;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
	
public class Collection004_map {
	//put get key size remove contains
	public static void main(String[] args) {
		Map<String, String> map=new HashMap<>();
		map.put("one", "하나");
		map.put("two", "두울");
		//map.put("one", "세엣");	 //키값이 같으면 덮어씀
		map.put("three", "세엣");
		
		System.out.println(map);
		System.out.println(map.get("one")); //2. 가져오기 key 주면 value 값
		System.out.println(map.size()); //3.갯수
		System.out.println(map.remove("three")); //4. 삭제 
		System.out.println(map.containsKey("one"));
		System.out.println(map.keySet()); // [one, two] 키들을 모아주세요
		System.out.println(map.values()); // 값들 모으기
		System.out.println(map.entrySet()); //[one=하나, two=두울] Set <Entry <String, String>> 
		
		System.out.println();
		System.out.println();
		//출력 향상된 for
		for( Entry <String, String> e : map.entrySet()) {
			System.out.println(e.getKey()+"/"+e.getValue());
		}
		
		//iter - ver1
		//1. key모으기 2. 처리대상확인 3. 값꺼내오기
		Iterator <String> iter=map.keySet().iterator(); //iter > [one, two]
		while(iter.hasNext()) {
			String key=iter.next();
			System.out.println(key+"/"+map.get(key));
		}
		System.out.println();
		System.out.println();
		//iter - ver2
		//1. entry모으기 2. 처리대상확인 3. 값꺼내오기
		Iterator <Entry <String, String>> eter=map.entrySet().iterator(); 
		//iter > [one=하나, two=두울]
		while(eter.hasNext()) {//처리대상확인
			 Entry <String, String> temp=eter.next(); //값꺼내기
			 System.out.println(temp.getKey()+"/"+temp.getValue());
		}
		
	}
}
/*
List: ##5. 기차 인덱스여부[O], 중복허용여부 [O], 
			[add get size remove contains]
Set : ##6. 주머니 인덱스여부[X], 중복허용여부 [X], 
			[add 향상된for문/iterator size romove contains]
Map : ##7. 사전 [키:값] -  쌍(entry), 
			[put get(key) size remove contains ]
*/