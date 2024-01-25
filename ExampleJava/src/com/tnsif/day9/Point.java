package com.tnsif.day9;

public class Point {
	private float X;
	private float Y;
	
	public Point() {
		X=10.0f;
		Y=20.0f;
	}
	public Point(float x) {
		this.X = x;
		
	}

	public Point(float x, float y) {
		this.X= x;
		this.Y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + X + ", y=" + Y + "]";
	}
}
