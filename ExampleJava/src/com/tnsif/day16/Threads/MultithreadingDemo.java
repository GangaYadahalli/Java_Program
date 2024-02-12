package com.tnsif.day16.Threads;


public class MultithreadingDemo {

	public static void main(String[] args) {

         int n =7; // no of threads
         for(int i=0; i< n; i++)
         {
        	 Multithreading obj = new Multithreading();
        	 obj.start();
         }
         

	}

}