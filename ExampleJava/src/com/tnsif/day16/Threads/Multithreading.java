package com.tnsif.day16.Threads;

public class Multithreading extends Thread {
	
	@SuppressWarnings("deprecation")
	public void run()
	{
		try {
			System.out.println("thread" +Thread.currentThread()+"is running");
		}
		catch(Exception e)
		{
			System.err.println("Exception caught" +e.getMessage());
		}

}

}
/*multithreading = will allocate same memory for different threads 
threads are independent
lightweight 
share same address space 
cost of communication is low
two ways to create thread class : extending a class , implementing a runnable(interface) 
 multiprocessing = will allocate different memory for different tasks or process
 heavyweight due to separate memory area 
 time consuming for switching between process
 cost of communication is high
 */