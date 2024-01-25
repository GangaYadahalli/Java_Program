package com.tnsif.day8;

public class AsDemo {

	public static void main(String[] args) {
		Address address1 = new Address("405 Laxmi Enclave, Pandit Colony", "Nashik", "Maharashtra", 422003);
		Person person = new Person("Aniket Pawar", address1);
		person.displayInfo();
		
	}

}
