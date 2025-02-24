package com.company.java006_ex;

public class RepeatEx008 {
	public static void main(String[]args) {
		int sum=0;
		for(int i=1; i<=10; i++) {
			if(i%3==0) {
				sum+=i;
				System.out.print(i+(i==9? "=":"+"));
			}
		}
		System.out.println(sum);
		System.out.println("1~10까지 3의 배수의 합 : "+sum);
		
		int i=1; sum=0; while(i<=10) {
			if(i%3==0) {
				System.out.print(i+ (i==9? "=":"+"));
				sum+=i;
			}
			i++;
		}
		System.out.println(sum);
		
		System.out.println("1~10까지 3의 배수의 합 : "+sum);
		i=1; sum=0; do{
			if(i%3==0) {
				sum+=i;
				System.out.print((i==3? "":"+")+i);
			}
			i++;
		}while(i<=10);
		System.out.println("="+sum);
		System.out.println("1~10까지 3의 배수의 합 : "+sum);
	}
}

/*
1~10까지 3의 배수의 합 :  3+6+9= 18
*/
