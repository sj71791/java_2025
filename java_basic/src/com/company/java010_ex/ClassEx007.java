package com.company.java010_ex;

import java.util.Scanner;

//1. 클래스는 부품객체
//2. 클래스는 상태(멤버변수)와 행위(멤버함수)

class Calc {
	static String name="**계산기**";
	int num1, num2;  char op;  double result;
	
	void show(){
		opcalc();
	}
	
	void opcalc() {
		if(op=='+') {
			System.out.println(""+num1+op+num2+"="+(num1+num2));
		}else if(op=='-') {
			System.out.println(""+num1+op+num2+"="+(num1-num2));
		}else if(op=='*') {
			System.out.println(""+num1+op+num2+"="+(num1*num2));
		}else if(op=='/') {
			System.out.printf("%d/%d=%.2f\n",num1,num2,(num1/(float)num2));
		}
		
	}
	
	void input(){
		Scanner scanner=new Scanner(System.in);
		System.out.print("첫번째 정수 입력 > ");
		num1=scanner.nextInt();
		System.out.print("두번째 정수 입력 > ");
		num2=scanner.nextInt();
		System.out.print("연산자 입력 > ");
		op=scanner.next().charAt(0);
	}
	//생성자-초기화
	Calc(){
	}

	Calc(int num1,int num2,char op){
		this.num1=num1; 
		this.num2=num2; 
		this.op=op;
	}	
	   //상태-멤버변수  :  int num1, num2;  char op;  double result;
	   //행위-멤버함수  :  void input()   입력받기
	   //               void opcalc() +더하기계산, -라면 -계산  , *라면 *계산 , /라면 /계산 
	   //                      void show()    연산출력   
}

public class ClassEx007 {
	public static void main(String[] args) {
		System.out.println(Calc.name); //클래스명.static변수 - new를 이용해서 사용x
		
		Calc  c1= new Calc(10,3,'+');  
		c1.show(); 
		System.out.println(c1.name);  //클래스명.static변수
		   
		Calc  c2= new Calc();  
		c2.input();   
		c2.show(); 

	}
	
}

/* 소스파일                                            -- 컴파일(번역) -- 바이트코드
  ClassEx007.java [class Calc / public ClassEx007{}]              calc.class /ClassEx007.class
## Class Loader
-------------------------------[ ## runtime ]
[method : 정보,static,final /공유] 
#1. calc.class /ClassEx007.class / calc.name[**계산기**]/main
---------------------------------------------
[heap: 동적]               | [stack:임시]
39번 2번지{num1:0,num2:0,op:0,result:0.0}  <-   c2:2번지
38번                               c1.show();
37번 1번지{num1:10,num2:3,op:+,result} <- c1:1번지                           
                           println(calc.name); //계산기**
35번                        | #2. main
---------------------------------------------
*/



//출력내용)
//10+3=3
//
//숫자1> 10
//숫자2> 3
//연산자> /
//10/3=3.33