package com.tnsif.day7.inheritance;

public class Country {
	private String countryName;
	private String capital;
	public Country() {
		System.out.println();
	}
	public Country(String countryName, String capital) {
		
		this.countryName = countryName;
		this.capital = capital;
	}
	
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	
	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", capital=" + capital + ", getCountryName()=" + getCountryName()
				+ ", getCapital()=" + getCapital() + "]";
	}
	
}
