package com.tnsif.day15.Exception;

public class TryCatchExample {
	static void performDivision(int x,int y)//no need to create objects hence directly call with class name in TryCatchDemo
	{
		int z;
		try {
			System.out.println("try block");
			z=x/y;
			System.out.println("resu is" +z);
		}
		catch(ArithmeticException e)
		{
			System.out.println("catch block"+e.getMessage());
		}
	}

}
