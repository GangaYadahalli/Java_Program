package com.tnsif.day6.third;

public class MyClass {
	private static MyClass=new MyClass();
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	//single ton class we can create only one object
	

	public MyClass(int id) {
	
		this.id = id;
	}

	private MyClass() {
		System.out.println();
	}

	@Override
	public String toString() {
		return "MyClass [id=" + id + ", getId()=" + getId() + "]";
	}
	
	
}
