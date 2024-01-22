package com.tnsif.assignment1;
import java.util.Scanner;
public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z;
        Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter x:");
		x=sc.nextInt();
		
		System.out.println("Enter y:");
		y=sc.nextInt();
		
		System.out.println("Enter z:");
		z=sc.nextInt();
		
		int smallest=(x < y && x < z) ? x : ((y < x && y < z) ? y : z);
		if(x == y && x==z)
		{
			
			System.out.println("All are equal");
		}
		else
		{
			System.out.println("The smallest number is" +smallest );
		}
	}

}
