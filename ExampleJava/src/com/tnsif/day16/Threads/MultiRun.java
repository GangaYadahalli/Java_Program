package com.tnsif.day16.Threads;

public class MultiRun implements Runnable {// Runnable is an interface which is inbuilt 
		
		public void run() {
		try {
			
			System.out.println("thread" +Thread.currentThread().getId()+"is running" );
		}
	    catch(Exception e)
		{
	    	System.out.println("Exception is caught");
		}
	}
	}
