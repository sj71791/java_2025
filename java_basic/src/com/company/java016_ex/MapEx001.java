package com.company.java016_ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class MapEx001 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Map<String, String> map=new HashMap();
		map.put("피구왕","통키");
		map.put("제빵왕", "김탁구");
		map.put("요리왕", "비룡");
		
		System.out.println("==============================\r\n"
				+ "KING   NAME\r\n"
				+ "==============================\n");
		Iterator<String> iter=map.keySet().iterator();
		while(iter.hasNext()) {
			String key=iter.next();
			System.out.println(key+"\t"+map.get(key)+"\n----------------\n");
		}
		
		System.out.print("이름을 입력하세요> ");
		String name=scanner.next();
		if(map.containsKey(name)) {
			System.out.println("□"+name+": "+map.get(name));
		}
		
	}
}
