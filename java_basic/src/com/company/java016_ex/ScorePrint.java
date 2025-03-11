package com.company.java016_ex;

public class ScorePrint {
	public void show(Score[] std) {
		for(Score s:std) {
			System.out.println("\n::::::::::::::::::::::::::::::::::::::::::::::\n이름\t국어\t영어\t수학\t평균\t합격여부\n::::::::::::::::::::::::::::::::::::::::::::::\n"+
					s.getName()+"\t"+s.getS1()+"\t"+s.getS2()+"\t"+s.getS3()+"\t"+String.format("%.2f", s.getAvg())+"\t"+s.getPass());
		}
		
	}
	
}
