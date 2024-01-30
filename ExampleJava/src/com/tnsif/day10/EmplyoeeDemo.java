package com.tnsif.day10;

public class EmplyoeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Employee.companyName="Xyz");
		System.out.println();
		Employee e1=new Employee("ganga",123);
		System.out.println(e1);
	}

}
/*Final keyword to create constant variable 
  prevent inheritance
  prevent method overriding  
 value cannot be change 
 cannot be extended by a subclass 
 initialized either at the time of declaration
 improve security 
 */