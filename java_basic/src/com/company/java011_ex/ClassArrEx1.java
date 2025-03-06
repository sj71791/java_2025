package com.company.java011_ex;
public class ClassArrEx1 {
	public static void main(String[] args) {
		Apple [] apples=new Apple[3];
		apples[0]=new Apple("Red","iron",2,1000);
		apples[1]=new Apple("Green","hulk",2,1000);
		apples[2]=new Apple("Gold","captain",3,2000);
		
//		//위 화면 출력
//		for(int i=0; i<apples.length; i++) {System.out.println(apples[i]);}
		
		//향상된 for(해당자료형 one : 배열){}
		for(Apple one: apples) {System.out.println(one);}
	}
}
