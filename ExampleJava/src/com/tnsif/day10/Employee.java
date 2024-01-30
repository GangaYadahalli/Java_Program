package com.tnsif.day10;
// static demo 
public class Employee {
	private String name;
	private int Id;
	static String companyName ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public static String getCompanyName() {
		return companyName;
	}
	public static void setCompanyName(String companyName) {
		Employee.companyName = companyName;
	}
	public Employee(String name, int id) {
		this.name = name;
		Id = id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", Id=" + Id + "]";
	}

}
/*
static keyword is used for memory management 
static keyword belongs to to class rather than instance of a class or object of class
static and final keyword are non access modifiers
shared memory allocation =allocates only while execution 
accessable without object instantiation
can be overloaded but not overrided
cannot be accessed with non static members only static members are accessed
we can change value of static variables it is not constant 
*/