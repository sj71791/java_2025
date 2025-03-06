package com.company.java012;
/*
		  Object
		    ↑
		   Calc (exec)
	↑	  ↑		↑		↑
	plus Minus Multi  Divide
 */
class Calc extends Object{void exec(double d1, double d2){System.out.println();}}
class Plus extends Calc{void exec(double d1, double d2){System.out.println(d1+d2);}}
class Minus extends Calc{void exec(double d1, double d2){System.out.println(d1-d2);}}
class Mutiply extends Calc{void exec(double d1, double d2){System.out.println(d1*d2);}}
class Divide extends Calc{void exec(double d1, double d2){System.out.println(d1/d2);}}

public class Poly005 {
	public static void main(String[] args) {
		Calc [] my = {new Plus(), new Minus(), new Mutiply(), new Divide()};
		my[0].exec(10, 3);
		my[1].exec(10, 3);
		my[2].exec(10, 3);
		my[3].exec(10, 3);
	}
}
