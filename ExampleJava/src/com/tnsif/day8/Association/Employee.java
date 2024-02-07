package com.tnsif.day8.Association;

public class Employee {
	private String name;
	private int EmployeeId;
	private String Department;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	
	public Employee() {
		System.out.println();
	}
	public Employee(String name, int employeeId, String department) {
		this.name = name;
		EmployeeId = employeeId;
		Department = department;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", EmployeeId=" + EmployeeId + ", Department=" + Department + "]";
	}
}

