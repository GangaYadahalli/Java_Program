package com.tnsif.day9;

public class OverloadingDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College obj=new College("xyz",1000);
		System.out.println(obj);
		College obj1=new College(1000);
		System.out.println(obj1);
	}

}
