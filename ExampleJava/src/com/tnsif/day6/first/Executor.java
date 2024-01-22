package com.tnsif.day6.first;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base obj=new Base();
		//private variable or methods cannot be accessed outside the class they can be accessed only in which they are declared 
		obj.methodDefault();
		obj.methodPublic();
		obj.methodProtected();
	}

}
