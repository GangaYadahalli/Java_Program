package com.tnsif.day4;
import java.util.Scanner;
public class PersonDemo {

	public static void main(String[] args) {
		//my method created 
		Person obj = new Person();//new allocates memory for obj object 
		String name,gender;
		int income,tax,age;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter name");
		name=sc.nextLine();//multiple words
		
		System.out.println("Enter gender");
		gender=sc.next();//for one word
		
		System.out.println("Enter income");
		income=sc.nextInt();
		
		System.out.println("Enter tax");
		tax=sc.nextInt();
		
		System.out.println("Enter age");
		age=sc.nextInt();
		
        obj.setName(name);
        obj.setGender(gender);
        obj.setIncome(income);
	    obj.setTax(tax);
        obj.setAge(age);
//		obj.setName("ram");
//		obj.setGender("male");
//     	obj.setIncome(100000);
//    	obj.setTax(100);
//        obj.setAge(22);
		System.out.println(obj);
		
	}
}
