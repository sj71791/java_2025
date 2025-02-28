package com.company.java010_ex;

//1.클래스는 부품객체
//2. 상태와 행위
class Card{
	int cardNum; boolean isMembership;  
	//상태-멤버변수  : 채널/볼륨 int cardNum; boolean  isMembership;   
	//행위-멤버함수  : x
	//Card(){} 생략되어있음. 컴파일러가 자동생성
	// alt+shift+s (밑에서 2,3,4)
	@Override
	public String toString() {
		return "Card [cardNum=" + cardNum + ", isMembership=" + isMembership + "]";
	}
	//1. Card() : 생성자 오버로딩시 컴파일러가 기본생성자 자동생성취소
	//2. Card() : 기본생성자 기본셋팅 - 멤버쉽이니? cardNum=1; 멤버쉽=true
	public Card() {this.cardNum=1; this.isMembership=true;}
	public Card(int cardNum, boolean isMembership) {
		super();
		this.cardNum = cardNum;
		this.isMembership = isMembership;
	}
	
	}
public class ClassEx005 {
	public static void main(String[] args) {
		Card  c1= new Card();
		System.out.println(c1);  
		
		Card c2=new Card(3, false);
		System.out.println(c2);
	}
}
/*
연습문제3)  class
패키지명 : com.company.java010_ex
클래스명 :  ClassEx005
-- 생성자 작성하시오.
class Card{
   //상태-멤버변수  : 채널/볼륨 int cardNum; boolean  isMembership;   
   //행위-멤버함수  : 채널, 볼륨 입력: input() / 출력 : show()
}
public class ClassEx005{
   public static void main(String[] args) {
   Card  c1= new Card(); 
   System.out.println(c1);  
   }
}

출력내용 :
Card[cardNum=0, isMembership=false]
*/