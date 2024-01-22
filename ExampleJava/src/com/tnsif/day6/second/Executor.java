package com.tnsif.day6.second;

import com.tnsif.day6.first.Base;
import com.tnsif.day6.first.Person;
public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj=new Person();
		Base obj2=new Base();
		
		obj.setName("ganga");
		obj.setCity("Bangalore");
		obj.setAge(22);
		
		System.out.println(obj);
		obj2.methodPublic();
	}

}
