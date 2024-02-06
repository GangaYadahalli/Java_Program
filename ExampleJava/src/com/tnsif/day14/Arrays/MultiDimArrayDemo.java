package com.tnsif.day14.Arrays;

public class MultiDimArrayDemo {
	public static void main(String[] args) {

		int c[][] = { { 12, 45 }, { 10, 40 }, { 5, 7 } }; // new int[3][2];

		System.out.println("No. of Rows in C array : " + c.length);

		MLArray.printArray(c);
	}

}
/*
arrays 
all arrays are dynamically allocated 
contiguous memory
--type var_name[]
--type[] var_name
a binary search sorts in ascending order 
Arrays.toString(array_name) to print in array format (need to import java.util.arrays)
Multidimensional array are array of arrays
Jagged array ([]) type of Multidimensional array where row elements are always fixed and column array elements are not fixed it can have empty values 
row size is always important in Multidimensional array (.length will give number of rows )
size of array is fixed once defined
insertion and of array elements id difficult
does not allow different data types
*/