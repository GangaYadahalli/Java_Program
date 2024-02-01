package com.tnsif.day1;

import java.util.Scanner;

public class ThirdProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);

	    System.out.println("Enter two numbers a and b");
	   float  a = myObj.nextInt();
	    float b = myObj.nextInt();
	    float c;
	    c=a+b;
	    System.out.println("Sum " + c);
	    c=a-b;
	    System.out.println("sub" + c);
	    c=a*c;
	    System.out.println("multiply" + c);
	    c=a/b;
	    System.out.println("div" + c);
	}
}
//The toString() method in Java is a public method declared in the Object class. It is used to convert an object to a string.