package com.company.java009;

public class Repeat006 {
	public static void hi(){System.out.println("hi");}
	public static void hi(int a){System.out.println("hi "+a);}
	public static String hi(String a){return "hi "+a;}
	
	public static void main(String[] args) {
		hi();
		hi(1);
		System.out.println(hi("sally"));
	}
}
// 7. html+css+js
/*
	<button  class="btn btn-warning my-3" onclick="alert('이수정')"  > ONE </button>
	<button  class="btn btn-warning my-3" id="two" onclick="alert('이수정')"  > ONE </button>
	<script>
	   document.getElementById("two").onclick=function(){alert("이수정");};
	</script>
 */
