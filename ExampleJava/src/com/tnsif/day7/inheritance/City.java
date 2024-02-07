package com.tnsif.day7.inheritance;

public class City extends State{
	private String cityName;
	private float area;
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	public City() {
		super();
	}
	public City(String countryName, String capital,String stateName,String language,String cityName, float area) {
		super(countryName,capital,stateName,language);
		this.cityName = cityName;
		this.area = area;
	}
	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", area=" + area + ", getCityName()=" + getCityName() + ", getArea()="
				+ getArea() + ", getStateName()=" + getStateName() + ", getLanguage()=" + getLanguage()
				+ ", getCountryName()=" + getCountryName() + ", getCapital()=" + getCapital() + "]";
	}
	
}
