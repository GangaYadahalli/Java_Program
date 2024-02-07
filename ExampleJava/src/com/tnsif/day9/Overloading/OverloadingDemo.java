package com.tnsif.day9.Overloading;
//compile time polymorphism 
public class OverloadingDemo {

	public static void main(String[] args) {
		System.out.println("Constructor overloading");
		// TODO Auto-generated method stub
		Point p=new Point();
		System.out.println(p);
		Point p1=new Point(40);
		System.out.println(p1);
		Point p2=new Point(50,60);
		System.out.println(p2);
		System.out.println("method overloading");
		System.out.println("addition of two integers="+MethodOverloading.addition(100, 200));
		System.out.println("addition of two floating numbers="+MethodOverloading.addition(200.0f, 300.0f));
		System.out.println("addition of two one integer and one floating number="+MethodOverloading.addition(10, 20.0f));
		System.out.println("addition of two strings="+MethodOverloading.addition("200","300" ));
		
	}

}
