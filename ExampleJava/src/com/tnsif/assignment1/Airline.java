package com.tnsif.assignment1;
import java.util.Scanner;

public class Airline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirlineCustomer obj = new AirlineCustomer();//new allocates memory for obj object 
		String name,source, destination;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter name");
		name=sc.nextLine();//multiple words
		
		System.out.println("Enter source");
		source=sc.nextLine();//for one word
		
		System.out.println("Enter destination");
		destination=sc.nextLine();
		  obj.setName(name);
	        obj.setSource(source);
	        obj.setDestination(destination);
	        
	    	System.out.println("Dear "+name+ " welcome onboard with dervice from "+source+" to "+destination+ ".Thank you for choosing skylines. Enjoy your flight.");
	}

}
