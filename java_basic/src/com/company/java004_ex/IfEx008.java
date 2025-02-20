package com.company.java004_ex;

import java.util.Scanner;

public class IfEx008 {
	public static void main(String [] args) {
		// 연습문제8)
				int ko,ma,en,total; double avg; String name="", b="";
				String d="불합격", c="장학생대상아님";
				Scanner scanner = new Scanner(System.in);
				
				System.out.print("학번입력 > ");
				name=scanner.next();
				System.out.print("국어점수 입력 > ");
				ko=scanner.nextInt();
				System.out.print("수학점수 입력 > ");
				ma=scanner.nextInt();
				System.out.print("영어점수 입력 > ");
				en=scanner.nextInt();
				
				total=ko+en+ma;
				avg=total/3.0;
				
				System.out.println("========================================================================\n학번\t국어\t수학\t영어\t총점\t평균\t"
						+ "합격여부\t레벨\t장학생\n========================================================================");
				if(avg>=60 && (ko>=40 && ma>=40 && en>=40)) {d="합격";}
				if(avg>=95) {c="장학생";}
/*              b= (avg>=90)? "수":
					(avg>=80)?"우":
						(avg>=70)?"미":
							(avg>=60)?"양":"가";  */
				if(avg>=90) {b="수";}
				else if(avg>=80) {b="우";}
				else if(avg>=70) {b="미";}
				else if(avg>=60) {b="양";}
				else {b="가";}
				
				System.out.print(name+"\t"+ko+"\t"+en+"\t"+ma+"\t"+total+"\t"+avg+"\t"
						+d+"\t"+b+"\t"+c);
	}

}
