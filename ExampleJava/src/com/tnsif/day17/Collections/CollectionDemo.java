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
//public static void main(String[] args) { // import java.util.package ;
//  List <String> fruitcollection = new ArrayList<>();
//fruitcollection.add(1,"banana");
//}










/* collection interface is member of java collections framework and serves as base interface 
add, remove , contains ,size, and iterator allow you to manipulate data and traverse collection 
extends the Iterable interface = iterated in sequence 
set, list and queue = subinterfaces 
java 8 stream() and parallelstream()
collection = list (vector , ArrayList LinkedList)
Queue

 = Dequeue (ArrayDequeue)
set = sortedSet(HashSet , LinkedHashSet ,TreeSet)
//Collection is able to form the root or head of the hierarchy of interfaces in the java collection framework.
//Collections class uses static methods for computations, also known as utility methods that are used to operate on the collection.
 ArrayList = duplicate list 
 set = no duplicate list 
 difference between all these when to use all these at which conditions 
boolean add()
<> generics (angular brackets)
array will allow duplicate elements and allow indexing 
set no duplicate elements and not allow indexing and print in random way 
collection will not support indexing 
*/