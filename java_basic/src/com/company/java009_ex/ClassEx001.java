package com.company.java009_ex;

class Student001{
	String name;  int no, kor, eng, math;
	void info() {
		int total=kor+eng+math;
		double avg=(kor+eng+math)/3.0;
		System.out.println("이름 : "+this.name);
		System.out.println("총점 : "+(this.kor+this.eng+this.math));
		System.out.printf("평균 : %.2f",(this.kor+this.eng+this.math)/3f);
		//System.out.printf("학번: %d\n이름: %s\n총점: %d\n평균: %.2f",no,name,total,avg);
	}
}
public class ClassEx001 {
	public static void main(String[] args) {
		Student001   s1 = new Student001(); //1. new (공간 객체생성) 2. Student001() 초기화 3. s1 지번
		s1.name="first";  s1.no=11; s1.kor=100; s1.eng=100; s1.math=99;
		s1.info();
	}
}
/* 클래스는 설계도 - 인스턴스화(heap - new - 객체생성)을 통해 - 객체(객체들 s1,s2,s3 뭉쳐서표현) / 인스턴스(각각의 s1.name, s2.name)
------------------------------------  [runtime data area]
[method:정보, static, final:공용정보]  Student001.class / classEx001.class
------------------------------------
[heap:동적]                                          |[stack:잠깐빌리기]
17번째줄 : 1번지 {name=first, no=11, kor=100, eng=100, math=99} ← s1 :1번지  
16번째줄 : 1번지 {name=null, no=0, kor=0, eng=0, math=0} ← s1 : 1번지
                                                    | main            
------------------------------------///
*/
//출력내용 : 
//이름: first
//총점 : 299
//평균 : 99.67