package com.tnsif.day9.Overloading;

public class College {
	private String studentName;
	private int studentId;
	public College()
	{
		
	}
	public College(String Studentname,int Studentid)
	{
		this.studentName=Studentname;
		this.studentId=Studentid;
	}
	public College(int Studentid)
	{
		this.studentId=Studentid;
	}
	@Override
	public String toString() {
		return "College [studentName=" + studentName + ", studentId=" + studentId + "]";
	}
	

}
