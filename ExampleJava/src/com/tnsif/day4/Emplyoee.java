package com.tnsif.day4;
/*encapsulation :binding the data into a single unit  
constructor :special member function which is automatically invoked when an object is created
default constructor
parametrized constructor
*/
public class Emplyoee {
	private String name;
	private String dept;
	private int salary;
	private int id;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Emplyoee [name=" + name + ", dept=" + dept + ", salary=" + salary + ", id=" + id + ", age=" + age
				+ ", getName()=" + getName() + ", getDept()=" + getDept() + ", getSalary()=" + getSalary()
				+ ", getId()=" + getId() + ", getAge()=" + getAge() + "]";
	}
	

}
