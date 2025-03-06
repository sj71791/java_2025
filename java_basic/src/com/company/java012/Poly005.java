package com.company.java012;
/*
<<<<<<< HEAD
		  Object
		    ↑
		   Calc (exec)
	↑	  ↑		↑		↑
	plus Minus Multi  Divide
=======
		   Object
		     ↑
		   Calc (exec)
	 ↑	   ↑	↑		↑
	plus Minus Multi  Divide
	(exec)(exec)(exec)(exec)
>>>>>>> 1aca09002bc068ce3c8b6b92998796fcd9ee515d
 */
class Calc extends Object{void exec(double d1, double d2){System.out.println();}}
class Plus extends Calc{void exec(double d1, double d2){System.out.println(d1+d2);}}
class Minus extends Calc{void exec(double d1, double d2){System.out.println(d1-d2);}}
class Mutiply extends Calc{void exec(double d1, double d2){System.out.println(d1*d2);}}
class Divide extends Calc{void exec(double d1, double d2){System.out.println(d1/d2);}}

public class Poly005 {
	public static void main(String[] args) {
<<<<<<< HEAD
		Calc [] my = {new Plus(), new Minus(), new Mutiply(), new Divide()};
		my[0].exec(10, 3);
		my[1].exec(10, 3);
		my[2].exec(10, 3);
		my[3].exec(10, 3);
=======
		// 부모 = 자식 / 업캐스팅 / 타입캐스팅 필요X
		Calc [] my = {new Plus(), new Minus(), new Mutiply(), new Divide()};
		my[0].exec(10, 3); //더하기
		my[1].exec(10, 3); //빼기
		my[2].exec(10, 3); //곱하기
		my[3].exec(10, 3); //나누기
>>>>>>> 1aca09002bc068ce3c8b6b92998796fcd9ee515d
	}
}
