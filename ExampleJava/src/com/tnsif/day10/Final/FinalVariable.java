package com.tnsif.day10.Final;

public class FinalVariable {
	
	final int x=10;
	final static int y;
	final static int z=10;
//	void change()
//	{
//		x=20;//final variables cannot be reassigned 
//		
//		y=30;//final static variable cannot be reassigned 
//		
//	}
	
	static
	{
		y=20;
		//z=100;//once initialize cannot be reassigned
		System.out.println("value of y=" +y );
	}
	@Override
	public String toString() {
		return "FinalVariable [x=" + x + " y="+y+" z="+z+"]";
	}
}
