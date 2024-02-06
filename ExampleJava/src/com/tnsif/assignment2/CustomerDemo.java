package com.tnsif.assignment2;
import java.util.Scanner;
public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Customer c1=new Customer();
		String customerName;
		 int noAdults;
	      int noChildren;
		 int noDays;
			c1.display();
		customerName=sc.next();
		noAdults=sc.nextInt();
		noChildren=sc.nextInt();
		noDays=sc.nextInt();
		c1.setCustomerName(customerName);
		c1.setNoAdults(noAdults);
		c1.setNoChildren(noChildren);
		c1.setNoDays(noDays);
		System.out.println(customerName+":"+noAdults+":"+noChildren+":"+noDays);
		
		c1.calculatearea();
		c1.outcome();

	}

}
