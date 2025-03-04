package com.company.java011_ex;

/*초기화순서 : 기본값 → 명시적초기화 →초기화블록→생성자
final nation null	Korea		Korea(x) Korea(x)
final jumin null	null(X)		null(X)	 "00000"(O)
    name    null	null(X)		null(X)	 .연산자이용, (O)수정가능
*/
class User002 {
	   final String nation = "Korea";   //수정하지마
	   final String jumin;   //수정하지마
	   String name;

	   public User002() { jumin="00000"; } //jumin="00000"; 지우면 오류
	   public User002(String jumin, String name) {
	      this.jumin = jumin;
	      this.name = name;
	   }
	@Override
	public String toString() {
		return "User002 [nation=" + nation + ", jumin=" + jumin + ", name=" + name + "]";
	}
	}

public class FinalEx {
	public static void main(String[] args) {
	      User002 user1 = new User002("123456-1234567", "아이유");
	      System.out.println(user1);   
	      
//	      user1.nation = "USA";      //cannot be assigned 수정하지마
//	      user1.jumin  = "123123-1234321";  //cannot be assigned
	      user1.name = "IU"; 
	      System.out.println(user1);   
	   }

}
/*
----------------------------------
[method] User002.class, FinalEx.class, final{nation, jumin} //##1
----------------------------------
[heap]         												| [stack]
1번지 : {nation=Korea, jumin,="123456-1234567"name="아이유"} ← user1(1번지)
			   | [main] //##2
---------------------------------- 
*/
