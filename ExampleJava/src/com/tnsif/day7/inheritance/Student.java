package com.tnsif.day7.inheritance;

public class Student extends Citizen{
	private int rollNo;
	private String collgeName;
	public Student() {
		super();//no need to pass parameters in private constructors
	}
	
	public Student(String name,String aadharNo,String address,long phno,int rollNo, String collgeName) {
		super(name,aadharNo ,address, phno);
		this.rollNo = rollNo;
		this.collgeName = collgeName;
	}

	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCollgeName() {
		return collgeName;
	}
	public void setCollgeName(String collgeName) {
		this.collgeName = collgeName;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collgeName=" + collgeName + ", getRollNo()=" + getRollNo()
				+ ", getCollgeName()=" + getCollgeName() + ", getName()=" + getName() + ", getAadharNo()="
				+ getAadharNo() + ", getAddress()=" + getAddress() + ", getPhno()=" + getPhno() + "]";
	}

}
