package com.tnsif.day11;

public class Rectangle extends Shape{
	private float width,height;

	public Rectangle() {
		width=6.0f;
		height=7.0f;
		
	}
	public Rectangle(float width, float height) {
		super();
		this.width = width;
		this.height = height;
	}
	@Override
	void calArea()
	{
		area=width*height;
	}
}
