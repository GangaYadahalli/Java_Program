package com.tnsif.day4;

public class ContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("even numbers :");
		for(int k=5;k<15;k++)
		{
			if(k%2!=0)
				continue;
			System.out.println(k+ " ");
		}
		System.out.println("odd numbers :");
		for(int k=5;k<15;k++)
		{
			if(k%2==0)
				continue;
			System.out.println(k+ " ");
		}

	}

}
