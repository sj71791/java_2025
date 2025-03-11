package com.company.java016_ex;

public class ScoreProcess {
	
	public void process_avg(Score [] std) {
//		for(int i=0; i<std.length; i++) {
//			std[i].setAvg((std[i].getS1()+std[i].getS2()+std[i].getS3())/3.0);
//		}
		for(Score s:std) {
			s.setAvg((s.getS1()+s.getS2()+s.getS3())/3.0);
		}
	}
	
	public void process_pass(Score [] std) {
		for(Score s:std) {
			if(s.getAvg()>=80) {s.setPass("PASS");}
			else {s.setPass("X");}
		}
	}
}
