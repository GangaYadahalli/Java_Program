package com.tnsif.day12.nestedinterface;

public class NestedInterfaceClass implements MyInterface.MyInnerInterface{
	@Override
	public void show()
	{
		System.out.println("print method of nesteed interface");
	}

}
