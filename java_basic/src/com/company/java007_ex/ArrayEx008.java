package com.company.java007_ex;

import java.util.Arrays;

public class ArrayEx008 {
	public static void main(String [] args) {
		String[] name={"아이언맨","헐크","캡틴","토르","호크아이"};
	    int[] kor={100,20,90,70,35};   
	    int[] eng={100,50,95,80,100};
	    int[] mat={100,30,90,60,100};
	    int [] aver=new int[5];
	    int[] rank=new int[5];
	    int rk;
	    int[] star=new int[5];
	    
	    System.out.println("이름\t국어\t영어\t수학\t평균\t합격여부\t장학생\t등수\n::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	    
	    for(int i=0; i<name.length; i++) {
	    	aver[i]=(kor[i]+eng[i]+mat[i])/3;
	    }
	    
	    for(int j=0; j<aver.length; j++) {
	    	rk=1;
	    	for(int k=0; k<aver.length; k++) {
	    		if(aver[j]<aver[k]) {
	    			rk++;
	    		}
	    	}
	    	rank[j]=rk;
	    }
	    
	    for(int i=0; i<name.length; i++) {
	    	System.out.print(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"+aver[i]);
	    	if(aver[i]>=60) {
	    		System.out.print("\t합격");
	    	}else {System.out.print("\t불합격");}
	    	
	    	if(aver[i]>=95) {
	    		System.out.print("\t장학생");
	    	}else {System.out.print("\t-----");}
	    	System.out.print("\t"+rank[i]+"\t");
	    	
	    	star[i]=aver[i]/10;
	    	for(int k=1; k<=star[i]; k++) {
	    		System.out.print("★");
	    	}
	    	System.out.println();
	    } //for end
	} 
}

