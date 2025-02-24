package com.company.java006_ex;

public class RepeatEx009 {
	public static void main(String [] args) {
		//ABCDE
		//FGHIJ
		//KLMNO
	    //PQRST
		//UVWXY
		//Z
		for(int i='A'; i<='Z'; i++) {
			System.out.print((char)i);
			if((i-64)%5==0) {
				System.out.println();
			} //A(65)
			
//			if(i=='E' || i=='J' || i=='O' || i=='T' || i=='Y') {
//				System.out.println();
//			}
			
		}
		System.out.println();
		
		int i='A';while(i<='Z') {
			if(i%5==0) {
				System.out.println();
			}
			System.out.print((char)i);
			
//			if(i=='E' || i=='J' || i=='O' || i=='T' || i=='Y') {
//				System.out.println();
//			}
			
			i++;
		}
		System.out.println();
		
		i='A'; do {
			if(i%5==0) {
				System.out.println();
			}
			System.out.print((char)i);
			
//			if(i=='E' || i=='J' || i=='O' || i=='T' || i=='Y') {
//				System.out.println();
//			}
			
			i++;
		} while(i<='Z');
	}
}
