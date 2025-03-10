package com.company.java015_ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
class Score{
	private String name;
	private int s1,s2,s3;
	@Override
	public String toString() {
		return "Score [name=" + name + ", s1=" + s1 + ", s2=" + s2 + ", s3=" + s3 + "]";
	}
	public Score(String name, int s1, int s2, int s3) {
		super();
		this.name = name;
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}
	public Score() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getS1() {
		return s1;
	}
	public void setS1(int s1) {
		this.s1 = s1;
	}
	public int getS2() {
		return s2;
	}
	public void setS2(int s2) {
		this.s2 = s2;
	}
	public int getS3() {
		return s3;
	}
	public void setS3(int s3) {
		this.s3 = s3;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, s1, s2, s3);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Score other = (Score) obj;
		return Objects.equals(name, other.name) && s1 == other.s1 && s2 == other.s2 && s3 == other.s3;
	}
	
}
public class SetEx004 {
	public static void main(String[] args) {
		Set<Score> scores=new HashSet<>();
		scores.add(new  Score("아이언맨",30,40,50)); 
		scores.add(new  Score("아이언맨",30,40,50)); 
		scores.add(new  Score("아이언맨",30,40,50)); 
		scores.add(new Score("헐크"   ,40,60,70)); 
		scores.add(new  Score("캡틴",80,90,100));
		
		System.out.println("유저수 > "+scores.size());
		
		Iterator<Score> iter=scores.iterator(); //set 모으기
		while(iter.hasNext()) { //처리대상확인
			Score temp= iter.next(); 
			int total=temp.getS1()+temp.getS2()+temp.getS3();
			double avg=total/3.0;
			System.out.println(temp.getName()+"\t"+temp.getS1()+"\t"+temp.getS2()+"\t"+
					temp.getS3()+"\t"+total+"\t"+avg);
		}
	}
}
