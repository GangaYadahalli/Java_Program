package com.tnsif.day11;

public class AbstractDemo {

	public static void main(String[] args) {
		// dynamic binding or method overriding implementation of method at run time also known as run time polymorphism
		// static binding connects a function call to method when the program is being prepared for execution also known as compile time binding
		Shape s;
		s=new Rectangle();
		s.calArea();
		s.show();
		s=new Square();
		s.calArea();
		s.show();
	}

}
/*interface
 implments keyword is used to inherit interface to class
 extends keyword is used to inherit interface to interface 
 to achieve abstraction
to achieve multiple inheritance
code reusable
to achieve loose coupling
tight coupling =each and every object is dependent on class 
*/

