package com.tnsif.day15.Exception;

public class checkedExecption {
	private int x,Y;
	private String name;
	static void opertion(int x,int y,String name)
	{
	try
	{
		int z;
		z=x/y;
		//System.out.println(name);
		System.out.println(z);
		System.out.println(name);
		
	}
	catch(ArithmeticException  e)
	{
		System.out.println(e.getMessage());
		
	}
	catch(NullPointerException e)
	{
		System.out.println(e.getMessage());
	}
}
}