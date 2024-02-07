package com.tnsif.day11.Polymorphism;

public abstract class Shape {
	protected float area;
	//abstract method
	abstract void calArea();
	//concrete method
	void show()
	{
		System.out.println("area is :"+area);
	}
}
//showing functionality to user and hiding the implementation 