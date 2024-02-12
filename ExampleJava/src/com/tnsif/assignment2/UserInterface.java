package com.tnsif.assignment2;
import java.util.*;
public class UserInterface {

		// TODO Auto-generated method stub
public String getDuplicateElement()
{
	try {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the array size:");
	int size=sc.nextInt();
	if(size<0)
	{
		System.out.println("array size invalid");
	}
	
	int[] arr1=new int[size];
	System.out.println("enter the array elements:");
	for(int i=0;i<size;i++)
	{
		arr1[i]=sc.nextInt();
	}
	System.out.println("enter the index of element:");
	int index=sc.nextInt();
	if(index<0 ||index>size)
	{
		System.out.println("array index out of range");
	}
	int duplicateElement = arr1[index];
    return "The array elements are " + arraytostring(arr1) + " " + duplicateElement;
} catch (InputMismatchException e) {
    return "Input was not in the correct format";
} catch (NegativeArraySizeException e) {
    return "Array size should be positive";
} catch (ArrayIndexOutOfBoundsException e) {
    return "Array index is out of range";
}
}
private static String arraytostring(int arr1[])
{
	StringBuilder rs=new StringBuilder();
	for(int num:arr1)
	{
	rs.append(num).append(" ");
	}
	return rs.toString();
}

public static void main(String[] args) { 
	UserInterface u1=new UserInterface ();
		System.out.println(u1.getDuplicateElement());
}}