package com.tnsif.day3;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20,c=30;
		if(a>b)
		{
			if(a>c)
				System.out.println("a is largest=" +a);
			else
				System.out.println("c is largest=" +c);
		}
		else
		{
			if(c>b)
				System.out.println("c is largest=" +c);
			else
				System.out.println("b is largest=" +b);
		}
	}

}
