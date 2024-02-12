package com.tnsif.day16.Threads;

public class MultiRunDemo {

	public static void main(String[] args) {

      int n=10;
      for (int i=0 ; i< 10; i++)
      {
    	 // MultiRun obj = new MultiRun();
    	  Thread objj = new Thread(new MultiRun());
    	  objj.start();
      }

	}

}
/* creating multithreading with thread we can inherit only one as java does not support multiple inheritance
with runnable we can inherit it many times
synchronization interthread communication =when many threads try to access at the same then it leads to inconsistency
 wait()= when we want thread to be in waiting stage 
 notify() =when we want notify a single thread  
 notifyall() =when we want to notify all the threads 
 */