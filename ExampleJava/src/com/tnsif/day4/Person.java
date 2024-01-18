package com.tnsif.day4;

public class Person {
	private String name;
	private int income;
	private String gender;
	private int tax;
	private int age;
	//getters and setters 
	public String getName() {// return the data
		return name;
	}
	public void setName(String name) {// sets the data
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	@Override // tostring methods
	public String toString() {
		return "Person [name=" + name + ", income=" + income + ", gender=" + gender + ", tax=" + tax + ", age=" + age
				+ ", getName()=" + getName() + ", getAge()=" + getAge() + ", getIncome()=" + getIncome()
				+ ", getGender()=" + getGender() + ", getTax()=" + getTax() + "]";
	}

}
