package com.tnsif.day12.instanceofinterface;

public class Samsung implements Phone{
	@Override
	public void call()
	{
		System.out.println("calling using Samsung");
	}
	@Override
	public void sms()
	{
		System.out.println("messaging using samsung");
	}

}
