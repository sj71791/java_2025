package com.company.java019;

//1. 프로세스 - 실행 중 프로그램
//2. 자원과 + Thread(작업수행)
// 작업수행클래스 1) Thread 상속, Runnable # 2) run 해야할일 3) start 실행
class   Animal{}
//class DogSound extends Animal, Thread{}  (X)

class DogSound extends Animal implements Runnable{ //Thread 상속, Runnable #
	@Override public void run() { //run 해야할 일
		try { Thread.sleep(10); } catch (InterruptedException e) { e.printStackTrace(); }
		
		for(int i=0; i<5; i++) {
			System.out.println("멍!");
			try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
		}
	}
	
}

public class Thread003_Runnable {
	public static void main(String[] args) {
		Thread sound = new Thread(new DogSound()); sound.start();
		
		Thread count = new Thread( new Runnable() { // runnable
			@Override public void run() { //run todo
				for(int i=0; i<5; i++) {
					System.out.println((i+1)+"마리");
					try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
				}
			}
		}); count.start(); //start
		
		for(int i=0; i<5; i++) {
			System.out.print("강아지 ");
			try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
		}
	}
}
