package com.company.java011_ex;

public class Score {
	//멤버변수
	private String name;
	private int kor, eng, math , total;
	private double aver;
	private String p  , s  , rank;
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAver() {
		return aver;
	}
	public void setAver(double aver) {
		this.aver = aver;
	}
	public String getP() {
		return p;
	}
	public void setP(String p) {
		this.p = p;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", total=" + total
				+ ", aver=" + aver + ", p=" + p + ", s=" + s + ", rank=" + rank + "]";
	}
	
	public Score(){this.name = this.p = this.s = this.rank = "";}

	public Score(String name, int kor, int eng, int math) {
		this();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		//사용자들에게 입력받은다음에 셋팅
	}
	public static void info(){
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"
				+ "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\r\n"
				+ "이름   국어   영어   수학   총점   평균   합격여부   장학생   랭킹\r\n"
				+ "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"
				+ ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
	}
	public void show() {
		this.total=kor+eng+math;
		this.aver=total/3.0;
		this.p=aver<60? "불합격":"합격";
		this.s=aver>90? "장학생":"장학생X";
		for(int i=1; i<=aver/10; i++) {
 		this.rank+="*";
		}
		System.out.println(name +"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+String.format("%.2f", aver)+"\t"+p+"\t"+s+"\t"+rank);
	}
	
		
		

}
