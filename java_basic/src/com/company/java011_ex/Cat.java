package com.company.java011_ex; //1.외부폴더

//cat부품
//class Cat{ 같은 폴더에서 class 사용해야함.
public class Cat {
	public 	  int public_;
	protected int protected_;
			  int package_;
	private   int private_; //cat 내부에만접근가능
	
	//getters+setters
	public int getPrivate_() {
		return private_;
	}
	public void setPrivate_(int private_) {
		this.private_ = private_;
	}
}
