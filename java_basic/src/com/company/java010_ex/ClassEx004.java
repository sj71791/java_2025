package com.company.java010_ex;

import java.util.Scanner;

class TV{
	//상태-멤버변수
	String channel; int volume;
	
	//행위-멤버함수
	//채널, 볼륨: input() / 출력 : show()
	void input() {
		//변수-입력-처리-출력
		Scanner scanner = new Scanner(System.in);
		System.out.println("* channel 입력> "); this.channel=scanner.next();
		System.out.println("* volume 입력> "); this.volume=scanner.nextInt();
	}
	void show() {System.out.println(this.channel + "\t"+this.volume);}
	TV(String channel, int volume){ this.channel=channel; this.volume=volume;}
	TV(){} //기본생성자: TV() 컴파일러 TV() 기본 자동생성 
		   //but 생성자를 개발자가 손대는 순간 자동생성취소
}

public class ClassEx004 {
	public static void main(String[] args) {
		TV t1=new TV("JDBC", 8);
		t1.show();
		TV t2 = new TV(); //1. new 객체생성  2. 생성자불려서초기화  3. t2=2번지
		t2.input(); 
		t2.show();
	}
}
/*
------------------------------- runtime 
[method] TV.class / ClassEx004.class #1
---------------------------------------------
[heap]               			| [stack]
29번째줄 :                t2.show(){2번지의 channel출력, 2번지의 volume출력}
27번쨰줄 : 2번지{channel=yt,volume=10} ← t2.input() {2번지의 channel입력, 2번지 볼륨입력}
27번쨰줄 : 2번지{channel=null,volume=0} ← t2 : 2번지
26번째줄 :                t1.show(){1번지의 channel출력, 1번지의 volume출력}
25번째줄 : 1번지{channel=JDBC,volume=8} ← t1 : 1번지
					 			| main #2
---------------------------------------------
*/
