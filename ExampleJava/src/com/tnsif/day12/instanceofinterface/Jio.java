package com.tnsif.day12.instanceofinterface;

public class Jio implements Phone {
	@Override
	public void call()
	{
		System.out.println("calling using jio");
	}
	@Override
	public void sms()
	{
		System.out.println("messaging using jio");
	}
}

