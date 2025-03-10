package com.company.java016_ex;

public class Score {
	private String name; private int s1,s2,s3;
	private double avg; private String pass;

	public Score() { 
		super(); 
	}

	public Score(String name, int s1, int s2, int s3) {
		super();
		this.name = name;
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}

	@Override
	public String toString() {
		return "Score [name=" + name + ", s1=" + s1 + ", s2=" + s2 + ", s3=" + s3 + ", avg=" + avg + ", pass=" + pass
				+ "]";
	}

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getS1() { return s1; }
	public void setS1(int s1) { this.s1 = s1; }
	public int getS2() { return s2; }
	public void setS2(int s2) { this.s2 = s2; }
	public int getS3() { return s3; }
	public void setS3(int s3) { this.s3 = s3; }
	public double getAvg() { return avg; }
	public void setAvg(double avg) { this.avg = avg; }
	public String getPass() { return pass; }
	public void setPass(String pass) { this.pass = pass; }

	
	
}
