package com.company.java015_ex;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ListEx002 {
	public static void main(String[] args) {
		List<String> numbers=new ArrayList<>();
		Scanner scanner=new Scanner(System.in);
		numbers.add("one");
		numbers.add("two");
		numbers.add("three");
		
		System.out.print("입력 > ");
		int a=scanner.nextInt();
		
		//ver-1	
//		switch(a) {
//		case 1: System.out.println(numbers.get(0)); break;
//		case 2: System.out.println(numbers.get(1)); break;
//		case 3: System.out.println(numbers.get(2)); break;
//		}		
		//ver-2
		if(a>0 && a<4) {System.out.println(numbers.get(a-1));}
		
	}
}
