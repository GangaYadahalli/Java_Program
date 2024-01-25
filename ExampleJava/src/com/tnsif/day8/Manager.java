package com.tnsif.day8;

public class Manager extends Employee{
	private int TeamSize;

	public int getTeamSize() {
		return TeamSize;
	}

	public void setTeamSize(int teamSize) {
		TeamSize = teamSize;
	}

	public Manager(String name,int EmployeeId,String Department,int teamSize) {
		super(name,EmployeeId,Department);
		TeamSize = teamSize;
	}

	@Override
	public String toString() {
		return "Manager [TeamSize=" + TeamSize + ", getName()=" + getName() + ", getEmployeeId()=" + getEmployeeId()
				+ ", getDepartment()=" + getDepartment() + "]";
	}
}
