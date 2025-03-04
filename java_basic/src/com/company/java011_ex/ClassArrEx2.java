package com.company.java011_ex;

import com.company.java011_ex.*;

public class ClassArrEx2 {
	public static void main(String[] args) {
		//MVC
		//////MODEL
		Score2[] std = new Score2[3];  
		std[0]=new Score2("아이언맨",100,100,100);// 0번째에는 아이언맨 정보넣기  - "아이언맨", 100, 100, 100
		std[1]=new Score2("헐크",90,60,80);// 1번째에는 아이언맨 정보넣기  - "헐크", 90, 60, 80
		std[2]=new Score2("블랙팬서",20, 60, 90);// 2번째에는 아이언맨 정보넣기  - "블랙팬서", 20, 60, 90
		   
		////// CONTROLLER - 처리 해결사 Controller)
//		System.out.println("main 주소확인: "+System.identityHashCode(std));
		Score2Process process = new Score2Process();
		process.process_avg(std); //void process_avg(Score2[] std){평균구하기}
		process.process_pass(std); //void process_pass(Score2[] std){합격여부구하기} 
		
		////// VIEW       - CONSOLE , WEB
		Score2Print  print = new Score2Print();
		print.show(std); 
	} 

}
