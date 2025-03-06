package com.company.java012;
// 상속 - 클래스 재사용(재활용) , 오버라이드 - 부모메서드 나한테맞게 수정
class MobileNote7 extends Object{
	private String Iris;

	public String getIris() { return Iris; }
	public void setIris(String Iris) { this.Iris = Iris; }

	void newShow() { System.out.println("NOTE7새로운기능(Overriding)\n= iris 홍체인식기능!\n= myiris : "+getIris()); }
}
class MobileNote8 extends MobileNote7{
	private String Face;
	
	public String getFace() { return Face; }
	public void setFace(String Face) { this.Face = Face; }
	@Override protected void newShow() {
		super.newShow();
		System.out.println("NOTE8새로운기능(Overriding)\n= face 안면인식기능!\n= face : "+getFace());
	}
}	
class MoblieNote9 extends MobileNote8{
	private int battery=24;
	
	public int getBattery() { return battery; }
	public void setBattery(int battery) { this.battery = battery; }

	@Override public void newShow() {
		super.newShow(); //MobileNote8의 newshow()
		System.out.println("NOTE9새로운기능(Overriding)\n= battery 하루종일 사용가능!\n= battery : "+getBattery());
	}
}
	

public class Extends003 {
	public static void main(String[] args) {
		MoblieNote9 my9=new MoblieNote9();
		my9.setIris("brown");
		my9.setFace("pretty");
		my9.newShow();
	}
}
