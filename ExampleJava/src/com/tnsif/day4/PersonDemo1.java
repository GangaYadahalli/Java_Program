package com.tnsif.day4;
import java.util.Scanner;
public class PersonDemo1 {

	public static void main(String[] args) {
		//my method created 
		Person person = new Person();//new allocates memory for obj object 
		String name,gender;
		int income,age;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter name");
		name=sc.nextLine();//multiple words
		
		System.out.println("Enter gender");
		gender=sc.next();//for one word
		
		System.out.println("Enter income");
		income=sc.nextInt();
		
		System.out.println("Enter age");
		age=sc.nextInt();
		
        person.setName(name);
        person.setGender(gender);
        person.setIncome(income);
        person.setAge(age);

		TaxCalculation tax=new TaxCalculation();
		tax.calculateTax(person);
	}
}

