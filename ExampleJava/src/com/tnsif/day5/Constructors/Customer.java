package com.tnsif.day5.Constructors;

public class Customer {

	private String  customerName;
	private String customerCity;
	private String customerId;
	
	
//default constructors
	public Customer() {
		System.out.println("default constructors");
	}
//parametrized constructors
	public Customer(String customerName, String customerCity, String customerId) {
		
		this.customerName = customerName;
		this.customerCity = customerCity;
		this.customerId = customerId;
		System.out.println("parametrized constructors");
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerCity=" + customerCity + ", customerId="
				+ customerId + "]";
	}
}
/*package is collection of classes and interface
Built in package and user defined package
Meaningful names for package
follow name conventions all are small letters.
*/
/*  private access modifier
 *  default access modifier  
 * protected access modifier 
 * public access modifier */
