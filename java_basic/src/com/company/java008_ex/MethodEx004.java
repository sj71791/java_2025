package com.company.java008_ex;

import java.util.Scanner;

public class MethodEx004 {
	public static int process_total(int a,int b,int c) {return a+b+c;}
	public static float process_avg(int a) {return a/3f;}
	public static String process_pass(double a,int b,int c,int d) {
	return a>=60? "합격": b<40||c<40||d<40? "재시험":"불합격";
	}
	public static String process_scholar(double a) {return (a>=95? "장학생":"장학생x");}
	public static String process_star(double a) {
		int num=(int)(a/10);
		String result="";
		for(int i=1; i<=num; i++) {
			result+="★";
		}
		return result;
		
	}
	public static void process_show(String a,int b,int c,int d,int e, double f,String p,String j,String s) {
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\t%s\t%s\t%s",a,b,c,d,e,f,p,j,s);
		// (a+"\t"+b+"\t"+c+"\t"+d+"\t"+e+"\t"+f+"\t"+p+"\t"+j+"\t"+s);
	}
	
	public static void main(String[] args) {
		/////////////////////(1)  변수
		String name  = ""; 
		int kor, eng, math, total ;
		float avg = 0.0f; 
		String pass = "";
		String jang = "";
		String star= ""; 
		String level_kor="" , level_eng="" , level_math="";
		String re = "";
		Scanner scanner = new Scanner(System.in);
		String s="*";
		
		/////////////////////(2) 입력 : 이름, 국어, 영어, 수학점수를 입력받으시오.
		System.out.print("이름 > ");
		name=scanner.next();
		System.out.print("국어 > ");
		kor=scanner.nextInt();
		System.out.print("영어 > ");
		eng=scanner.nextInt();
		System.out.print("수학 > ");
		math=scanner.nextInt();
		/////////////////////(3) 처리 : 
		total = process_total(kor , eng, math);    // 1. 총점처리
		
		avg = process_avg(total);    //2.  평균처리
		
		////////3.  합격  평균이60이상이고, 각각 국어, 영어, 수학40이상/불합격/재시험-각각 40미만인게 있다면  
		pass = process_pass(avg, kor, eng, math);  
		
		//////// 4. 평균이 95점이상이면 장학생
		jang = process_scholar(  avg  ); 
		
		//////// 5. 평균점수대로 별표 붙이기 , 예) 70점대이면 별7개, 80점대이면 별8개, 90점대이면 별9개 , 100점이면 별10개 
		star = process_star(avg);  
		
		/////////////////////(4) 출력
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t합격여부\t장학생\t랭킹");
		process_show(name, kor, eng, math, total, avg, pass, jang, star);

	}
	
}
