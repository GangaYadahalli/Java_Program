package com.tnsif.day6.first;

import java.util.*;

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name,city;
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter person details:");
		name=sc.nextLine();
		city=sc.next();
		age=sc.nextInt();
		
	
		Person obj=new Person();
		obj.setName(name);
		obj.setCity(city);
		obj.setAge(age);
		System.out.println(obj);
	
	}

}
