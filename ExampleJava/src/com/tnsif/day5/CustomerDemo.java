package com.tnsif.day5;
import java.util.Scanner;
public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name ,id ,city;
		System.out.println("enter name");
		name=sc.nextLine();
		System.out.println("enter Id");
		id=sc.nextLine();
		System.out.println("enter city");
		city=sc.nextLine();
		
		System.out.println();
		
		//default constructor
		Customer c1=new Customer();
		c1.setCustomerName(name);
		c1.setCustomerId(id);
		c1.setCustomerCity(city);
		System.out.println(c1);
		
		//parametrized constructors
		Customer c2=new Customer(name,city,id);
		System.out.println("enter name");
		name=sc.nextLine();
		System.out.println("enter Id");
		id=sc.nextLine();
		System.out.println("enter city");
		city=sc.nextLine();
		System.out.println();
		
		
		c2.setCustomerName(name);
		c2.setCustomerId(id);
		c2.setCustomerCity(city);
		
		
		System.out.println(c2);
		//after utilizing we need to close the scanner object

		
	}

}
