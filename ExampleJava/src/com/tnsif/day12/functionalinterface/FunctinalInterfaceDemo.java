package com.tnsif.day12.functionalinterface;

public class FunctinalInterfaceDemo {

	public static void main(String[] args) {
		// using lambda expression= no need to create unnecessary objects
		//loose coupling executing without creating objects
		GreetInterface g1=()->{return "good morning";};
		System.out.println(g1.greet());
		
	}
}
