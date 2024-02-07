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
/*

exception handling 
checked exception(compile time) = inherit throwable class except runTimeException and error and need to handled
unchecked exception(runtime ) = arthematic exception 
error is irrecoverable 
Java exception keywords
1. try block = a block where we place exception code 
2. catch =handle the exception preceded by try block
3.finally = execute necessary code
4. throw =throw an exception
5. throws =  used to declare exceptions  always used with method signature 

throw when there are many exceptions instead of writing many try and catch block we can throw the exception and finally write one try and catch block 
entire method we want exception then we need throws method 
better is try catch method */
