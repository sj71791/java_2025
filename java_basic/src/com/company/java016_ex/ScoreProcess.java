package com.company.java016_ex;

public class ScoreProcess {
	private String name;
	private int s1,s2,s3;
	private double process_avg=(s1+s2+s3)/3;
	private String process_pass;
	public int getS1() { return s1; }
	public void setS1(int s1) { this.s1 = s1; }
	public int getS2() { return s2; }
	public void setS2(int s2) { this.s2 = s2; }
	public int getS3() { return s3; }
	public void setS3(int s3) { this.s3 = s3; }
	public double getProcess_avg() { return process_avg; }
	public void setProcess_avg(double process_avg) { this.process_avg = process_avg; }
	public String getProcess_pass() { return process_pass; }
	public void setProcess_pass(String process_pass) { this.process_pass = process_pass; }
	public String getName() { return name; }
	public void SetName(String name) { this.name = name; }
	
	
	@Override
	public String toString() {
		return "ScoreProcess [name=" + name + ", s1=" + s1 + ", s2=" + s2 + ", s3=" + s3 + ", process_avg="
				+ process_avg + ", process_pass=" + process_pass + "]";
	}
	public ScoreProcess(String name, int s1, int s2, int s3) {
		super();
		this.name = name;
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}
	public ScoreProcess() {
		super();
		if(process_avg>=80) {process_pass="pass";}
		else {process_pass="X";}
	}
	
	
	
}
