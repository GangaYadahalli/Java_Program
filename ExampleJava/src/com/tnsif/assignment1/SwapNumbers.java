package com.tnsif.assignment1;
import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first,second;
        Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter first number:");
		first=sc.nextInt();
		
		System.out.println("Enter second number:");
		second=sc.nextInt();
		  first = first ^ second;
	      second = first ^ second;
	        first = first ^ second;
	        System.out.println("Swapped first number:" +first);
	        System.out.println("Swapped second number:" +second);
	        
	}
}
