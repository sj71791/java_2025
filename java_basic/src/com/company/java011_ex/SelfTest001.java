package com.company.java011_ex;

import java.util.Scanner;

public class SelfTest001 {
	
	public static void cat() {System.out.println("야옹");}
	public static void hap(int a,int b) {
		System.out.println("두수의 합 : "+(a+b));
		}
	public static String hi(String a) {return "Hi! "+a+"~!";}
	public static void print(int a,int b) {System.out.println(a+b+" 출력");}
	public static void print(double a,double b) {System.out.println(a+b+" 출력");}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		//[001] 출력(1)
		System.out.println("Hello");
		
		//[002] 출력(2)
		System.out.println(10+ "+" +20+ "=" +(10+20));
		
		//[003] 입력   Scanner 테스트
		System.out.print("당신의 이름을 입력하세요._");
		String name=scanner.next();
		System.out.println("당신의 이름은 "+name+"입니다");
		
		//[004] IF (1형식)
		System.out.print("국어점수를입력해주세요 __");
		int ko=scanner.nextInt();
		System.out.print("영어점수를입력해주세요 __");
		int en=scanner.nextInt();
		if(ko<40) {System.out.println("국어과락");}
		if(en<40) {System.out.println("영어과락");}
		
		//[005] IF (2형식)
		System.out.print("당신의 나이를 입력하세요_");
		int age=scanner.nextInt();
		if(age<19) {System.out.println("미성년자입니다");}
		else {System.out.println("성인입니다.");}
		
		//[006] If ~ ELSE (3형식)
		System.out.print("국어점수를 입력해주세요_");
		int score=scanner.nextInt();
		if(score>=90) {
			System.out.println("수");
		}else if(score>=80) {
			System.out.println("우");
		}else if(score>=70) {
			System.out.println("미");
		}else if(score>=60) {
			System.out.println("양");
		}else {System.out.println("가");}
		
		//[007] SWITCH
		System.out.print("a,b,c중에 입력해주세요");
		char al=scanner.next().charAt(0);
		switch (al){
		case 'a': System.out.println("apple"); break;
		case 'b': System.out.println("banana"); break;
		case 'c': System.out.println("coconut"); break;
		}
		
		//[008] for (1,2,3,4,5,6,7,8,9,10 출력)
		for(int i=1; i<=10; i++) {
			System.out.print((i==1?"":",")+i);
		}
		System.out.println();
		
		//[009] while (1,2,3,4,5,6,7,8,9,10 출력)
		int i=1; while(i<=10) {
			System.out.print((i==1?"":",")+i);
			i++;
		}
		System.out.println();
		
		//[010] do while (1,2,3,4,5,6,7,8,9,10 출력)
		i=1; do {
			System.out.print((i==1?"":",")+i);
			i++;
		}while(i<=10);
		System.out.println();
		
		//[011] for(1~100사이를 입력하면 빠져나오기)
		for(;;) {
			System.out.print("숫자 입력: ");
			int num2=scanner.nextInt();
			if(num2<=100 && num2>=1) {break;}
		}
		
		//[012] while(1~100사이를 입력하면 빠져나오기)
		int j=-1; while(j>100 || j<1) {
			System.out.print("숫자 입력: ");
			j=scanner.nextInt();
			if(j<=100 && j>=1) {break;}
		}
		
		//[013] for 응용
		System.out.print("원하는 단을 입력하세요_");
		int num3=scanner.nextInt();
		for(i=1; i<10; i++) {
			System.out.println(num3+"*"+i+"="+(num3*i));		
		}
		
		//[014] 2~4단 출력
		for(i=2; i<5; i++) {
			for(j=1; j<10; j++) {
				System.out.println(i+"*"+j+"="+(i*j));		
			}
		}
		
		//[015] 배열(1)
		int [] arr=new int[5];
		for(i=0; i<arr.length; i++) {
			arr[i]=i+1;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
//		1 2 3 4 5 
		
		//[016] 이차원배열
		int innum=100;
		int [][] arr2=new int [2][3];
		for(i=0; i<arr2.length; i++) {
			for(j=0; j<arr2[0].length; j++) {
				arr2[i][j]=innum;
				System.out.print(arr2[i][j]+" ");
				innum++;
			}
			System.out.println();
			innum=200;
		}
//		100	101 102
//	 	200	201 202
		
		//[017] 이차원배열
		int a=1;
		int [][] arr3=new int[4][5];
		for(i=0; i<arr3.length; i++) {
			for(j=0; j<arr3[0].length; j++) {
				arr3[i][j]=a;
				a++;
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
//		1	2	3	4	5
//	 	6	7	8	9	10
//	 	11	12	13	14 	15
//	 	16	17	18	19	20
		
		//[018] 함수(1) : 함수의 구조
		cat();  //cat() 실행시 야옹출력
		
		//[019] 함수(2) : 파라미터
		hap(3,5); //두수의 합 : 8
		
		//[020] 함수(3) : return 
		System.out.println(hi("sally")); //Hi! sally~!
		
		//[021] 함수(4) : 메서드오버로딩
		print(3,5);     //8 출력
		print(1.2,3.4); //4.6 출력
		
//		[022] 함수(5) :  
//		메서드오버로딩과 오버라이딩이란?
		System.out.println("오버로딩은 메서드의 이름은 같고 매개변수의 개수와 유형을 다르도록 하는 것");
		System.out.println("오버라이딩은 상위클래스가 가지고 있는 메서드를 하위 클래스가 재정의해서 사용하는 것");
		
		
	}
}
