package com.tnsif.day6.first;

public class Base {
	//declaring default , public private ,protected variable
	int varDefault=10;
	public int  varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;
	//declaring default , public private ,protected methods
	void methodDefault()
	{
		System.out.println("Default varablic " +varDefault);
		System.out.println("Default method ");
	}
	public void methodPublic()
	{
		System.out.println("Public varablic " +varPublic);
		System.out.println("Public method ");
	}
	private void methodPrivate()
	{
		System.out.println("Private varablic " +varPrivate);
		System.out.println("Private method ");
	}
	protected void methodProtected()
	{
		System.out.println("Protected varablic " +varProtected);
		System.out.println("Protected method ");
	}
}
