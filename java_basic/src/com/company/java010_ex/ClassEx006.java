package com.company.java010_ex;
class Score{
	
	String stdid; int kor,eng,math,total; double avg;   
	void total() {
		total=kor+math+eng;
	}
	void avg() {
		avg=total/3.0;
	}
    void info() {
    	total(); //메서드안에서 메서드호출가능
    	avg();
    	System.out.printf("학번\tkor\teng\tmath\ttotal\tavg\n%s\t%d\t%d\t%d\t%d\t%.2f",stdid,kor,eng,math,total,avg);
    }
		
  //행위-멤버함수  :  void total() 총점구해주기
    //               void avg()  평균구하기
    //                      void info()   학생정보출력 
    
    Score() {super();}
    
	Score(String stdid, int kor, int eng, int math) {
		this.stdid = stdid;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
}

public class ClassEx006 {
	public static void main(String[] args) {
		Score  s1= new Score("std1234" , 100, 100 , 99 ); 
		s1.info();
		Score s2=new Score();
		
	}
}

//출력내용 :
//학번   kor   eng   math   total   avg
//std1234   100   100   99   299   99.67