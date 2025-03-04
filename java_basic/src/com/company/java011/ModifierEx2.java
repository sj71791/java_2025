package com.company.java011;
//public class Score{
//	   private String name;
//	   private int kor, eng, math , total;
//	   private double aver;
//	   private String p  , s  , rank;
//	} // java011_ex에 설정해주세요!

import com.company.java011_ex.Score;

public class ModifierEx2 {
//	public static void info() {
//		total=kor+eng+math;
//		aver=total/3.0;
//		if(kor>80 && eng>80 && math>80) {p="합격";}
//		else {p="불합격";}
//		for(int i=1; i<=aver/10; i++) {
//			rank+="*";
//		}
//		if(aver>95) {
//			s="장학생";
//		}else {s="장학생X";}
//	}
	public static void main(String[] args) {
		Score iron = new Score();     
	    Score hulk = new Score("hulk" , 20,50,30);    
	      
	    // Score.info()위에 메서드작성해주세요!  ##
	    // setter를 이용해주세요!
	    iron.setName("iron"); iron.setKor(100); iron.setEng(100); iron.setMath(100);
	      
	    Score.info();     // 클래스메서드
	    iron.show();          
	    hulk.show(); 
	}
}
