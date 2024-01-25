package com.tnsif.day9.Overriding;

public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBI rbi;
		rbi=new HDFC();
		System.out.println(rbi.getRateofInterest());
		rbi=new SBI();
		System.out.println(rbi.getRateofInterest());
		rbi=new ICICI();
		System.out.println(rbi.getRateofInterest());
	}

}
