package com.tnsif.day4;

public class SwitchDemo {

	public static void main(String[] args) {
		// compare to any other conditional statement switch is better
		char x='l';
		switch(x)
		{
		case 'L':
		case 'l':
			System.out.println(x+ " is the letter");
			break;
		case 'd':
		case 'D':
			System.out.println(x+ " is a digital");
			break;
		case 'n':
		case 'N':
			System.out.println(x+ "is a number");
		default:
			System.out.println("error");
		}	
	}
}
