package com.tnsif.day13.Strings;

public class StringOperationBuffer {
	public static void main(String[] args) {
		String s1 = new String("  Indian  ");
		String s2 = s1.toUpperCase();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.length());
		System.out.println(s1.substring(2, 5));
		System.out.println(s2.substring(2));
		System.out.println(s1.trim());
		System.out.println(s1.strip());
		System.out.println(s1.stripTrailing());
		System.out.println(s1.isEmpty());
	
		// String Comparison
		s1 = "Good Morning";
		s2 = new String(s1);

		System.out.println(s1 + " equals " + s2 + " -> " + s1.equals(s2));
		System.out.println(s1 + " == " + s2 + " -> " + (s1 == s2));

	}
}
/*difference between string append and string reverse
== reference equality 
equals() check if two strings have common content
compareTo()  
ways of creating string 1.with new keyword 2.with string literals
hashcode= allocated memory addresses or  reference number 
difference between == and compare to and equals  
string comparsion is best with compare to 
0 is true in case ascii characters 
for false we get negative numbers 
trim removes space
strip 
stripTrailing original string 
empty
cannot inherit string class

wrapper class contains primitive data types = char , byte , short ,int 
Autoboxing : conversion of primitive types to wrapper classes 
Unboxing : conversion of wrapper class to primitive types
**T2407010217
 */