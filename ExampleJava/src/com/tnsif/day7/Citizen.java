package com.tnsif.day7;
/*class
super class/parent class/Base class
sub class/child class
reusability
types of inheritance
1.Single inheritance
2.Multilevel inheritance
base class->derived class->derived class of privious class
3.Hierarchical inheritance = one base class many child class
hybrid inheritance is combination of hierarchical and multiple inheritance hence java does not support
java does not support multiple inheritance (two or more base class )so comes with the concept of interface*/



public class Citizen {
	private String name;
	private String aadharNo;
	private String address;
	private long phno;
	public Citizen() {
		System.out.println();
	}
	public Citizen(String name, String aadharNo, String address, long phno) {
		
		this.name = name;
		this.aadharNo = aadharNo;
		this.address = address;
		this.phno = phno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", aadharNo=" + aadharNo + ", address=" + address + ", phno=" + phno
				+ ", getName()=" + getName() + ", getAadharNo()=" + getAadharNo() + ", getAddress()=" + getAddress()
				+ ", getPhno()=" + getPhno() + "]";
	}
	
	
}
