package com.company.java019_ex;

import javax.swing.JOptionPane;

class QuestionCount2 implements Runnable{
	@Override public void run() {
		for(int i=10; i>0; i--) {
			System.out.println(i);
			try { Thread.sleep(1000); } catch (InterruptedException e) { break; }
		}
	} 
}
public class Thread001_2 {
	public static void main(String[] args) {
		Thread count = new Thread(new QuestionCount2()); count.start(); //start 실행
		
		String answer=JOptionPane.showInputDialog("사과알파벳을 입력하세요.");
		//System.out.println(answer);
		if(answer.equals("apple")) { System.out.println("정답입니다."); count.interrupt();}
		else { System.out.println("정답이 아닙니다."); count.interrupt();}
		System.out.println("main-end");
		
		
	}
}
/*
1. QuestionCount 10부터 1까지 카운트 1초에 10, 2초에 9...
2. 사과알파벳 입력
문제점 : 1) 정답말했는데 count 계속실행  2) main 끝났는데 다른 프로세스 실행중
 */