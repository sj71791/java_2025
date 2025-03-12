package com.company.java017;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda004_api {
	public static void main(String[] args) {
		//#1	Consumer<T> 받는용도 - accept
		//		void java.util.function.Consumer.accept ( T t )
		//		()->{} 파라미터 O / 리턴값 X
		//Consumer<String> consumer = (t)->{System.out.println("Hello "+t);};
		//Consumer<String> consumer = t -> System.out.println("Hello "+t);
		Consumer<String> consumer = System.out::println;
		
		consumer.accept("sally");
		consumer.accept("alpha");
		 
		//#2 Supplier - 제공용도 - get
		// T java.util.function.Supplier.get()
		// ()->{return}	파라미터X / 리턴값O
		Supplier<String> supplier=()->"hello";
		System.out.println(supplier.get()); //hello
		
		//#3 Predicate - 판단용도 - test
		// T java.util.function.Supplier.get()
		// ()->{return}	파라미터X / 리턴값O
		Predicate<Integer> predicate=t-> t<0;
		System.out.println(predicate.test(-1));
		System.out.println(predicate.test(1));
		
		//#4 Funciton - 처리용도 - apply
		//1. 메서드찾기 R java.util.function.Function.apply(T,t)
		//Function<String,Integer> function= t -> Integer.parseInt(t);
		Function<String,Integer> function= Integer::parseInt;
		System.out.println(function.apply("10")+3); //문자열 숫자 Integer.parseInt()
		
		//#5 Operator - 연산용도 - apply
		IntBinaryOperator operator= Math::max;
		IntBinaryOperator operator1= (left,right)->left>=right? left:right;
		System.out.println(operator1.applyAsInt(10,3));//큰값리턴
	}
}
/*
2.	자바 api의 함수형 인터페이스
1. Consumer - 받는용도 - accept
2. Supplier - 제공용도 - get
3. Predicate - 판단용도 - test
4. Function - 처리용도 - apply
5. Operator - 연산용도 - apply

*/