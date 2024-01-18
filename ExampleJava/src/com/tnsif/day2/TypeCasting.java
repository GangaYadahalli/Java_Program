package com.tnsif.day2;

public class TypeCasting {

	public static void main(String[] args) {
		// Implicit Type casting or widening 
		float f=45.8f;
		double d=f;
		System.out.println(d);
		int a=10;
		double d1=a;
		float f1=a;
		System.out.println(f1);
		System.out.println(d1);
		char ch='A';
		int b=ch;
		System.out.println(b);
		//explicit type casting 
		double f3=10.65d;
		float f2=(float) f3;
		System.out.println(f2);
	}

}
