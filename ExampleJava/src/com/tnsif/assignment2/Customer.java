package com.tnsif.assignment2;
public class Customer  
	{
		
		private String customerName;
		private int noAdults;
		private int noChildren;
		private int noDays;
		private int totalcost , sum;
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public int getNoAdults() {
			return noAdults;
		}
		public void setNoAdults(int noAdults) {
			this.noAdults = noAdults;
		}
		public int getNoChildren() {
			return noChildren;
		}
		public void setNoChildren(int noChildren) {
			this.noChildren = noChildren;
		}
		public int getNoDays() {
			return noDays;
		}
		public void setNoDays(int noDays) {
			this.noDays = noDays;
		}
		
		public Customer() {
			
		}
		public Customer(String customerName, int noAdults, int noChildren, int noDays) {
			
			this.customerName = customerName;
			this.noAdults = noAdults;
			this.noChildren = noChildren;
			this.noDays = noDays;
		}
		public void display()
		{
			System.out.println("enter the customer details:");
		}
		public void calculatearea()
		{
			sum=noDays*(1000*noAdults+650*noChildren);
			
		}
		public void outcome() {
		if(noAdults==0)
	{
			System.out.println("\033[0;1m Invalid input for number of adults");
		}
		else if(noChildren==0)
		{
		System.out.println("\033[0;1m Invalid input for number of children");
		}
		else if(noDays==0)
		{
			System.out.println("\033[0;1m Invalid input for number of days");
	}
		else {
			System.out.println(customerName+" your booking is confirmed and the total cost is "+sum);
		}
		}
	
		
}
