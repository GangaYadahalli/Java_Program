package com.tnsif.day3;

public class Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int x=10;
		System.out.println("value of a and b= "+a+" "+b);
		++a;
		int c=++a+b+a--;
		System.out.println("c value=" +c);
		int d=c++ +a+ b--;
		System.out.println("value of d=" +d);
		System.out.println(+a+" "+b+" "+c+" "+d);
		x=(10==x)?1:0;
		System.out.println(x);
	}

}
