package com.tnsif.day12.extendinginterface;

public class ExtendingInterfaceDemo implements ChildInterface{
	@Override
	public void print()
	{
		System.out.println("extended print method");
	}
	@Override
	public void show()
			{
		System.out.println("extended show method");
			}
}
