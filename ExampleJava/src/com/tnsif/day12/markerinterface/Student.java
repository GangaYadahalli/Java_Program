package com.tnsif.day12.markerinterface;

public class Student implements Registrable{
	private String name;
	private String Course;
	private int id;
	private double fees;
	public String getName()
	{
		return name;
	}
	public void setName(String Course)
	{
		this.Course=Course;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public Student(String name, String course, int id, double fees) {
		
		this.name = name;
		Course = course;
		this.id = id;
		this.fees = fees;
	}
	public Student() {
		
	}
//	public void display()//specifies methods with void cannot return type 
//	{
//		System.out.println("Name="+name +" Course="+Course+" Id="+id+" Fees="+fees);;
//	}
	@Override
	public String toString() {
	return "Student [name=" + name + ", Course=" + Course + ", id=" + id + ", fees=" + fees + "]";
	}

}
