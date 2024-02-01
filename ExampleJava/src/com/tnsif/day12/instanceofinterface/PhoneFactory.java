package com.tnsif.day12.instanceofinterface;

public class PhoneFactory {
	public static Phone createPhone(String company) {
		if (company.equalsIgnoreCase("Samsung"))
			return new Samsung();
		else if (company.equalsIgnoreCase("Jio"))
			return new Jio();
		return null;
	}
}
/*extending interface
instance interface 
functional interface 
marker interface
nested interface

*/