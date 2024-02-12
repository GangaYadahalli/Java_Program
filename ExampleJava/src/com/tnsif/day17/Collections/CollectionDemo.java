package com.tnsif.day17.Collections;


import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {

     Collection  <String> fruitcollection = new ArrayList<>();
     fruitcollection.add("banana");
     fruitcollection.add("apple");
     fruitcollection.add("mango");
     fruitcollection.add("strawberry");
     fruitcollection.add("banana");
     
     System.out.println(fruitcollection);
     
		
	}
}