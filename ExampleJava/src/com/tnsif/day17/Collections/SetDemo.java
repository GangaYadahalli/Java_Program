package com.tnsif.day17.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <Integer> list=new HashSet<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		System.out.println(list);
	}

}
//HashSet not in order and TreeSet prints in ordered 