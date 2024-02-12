package com.tnsif.day16.Threads;


public class ChildThread extends Thread {
    private int n;
    private String msg;

    public ChildThread(int n, String msg) {
        this.n = n;
        this.msg = msg;
    }

    @Override
    public void run() {
        for (int i = 1; i <= n; i++) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                System.err.println("Thread interrupted: " + e.getMessage());
                Thread.currentThread().interrupt(); // Restore interrupted status
            }
            System.out.println(msg + i + " " + Thread.currentThread().getName());
        }
    }
}
/* collection interface is member of java collections framework and serves as base interface 
 add, remove , contains ,size, and iterator allow you to manipulate data 
 extends the Iterable interface = iterated in sequence 
 set, list and queue = subinterfaces 
 java 8 stream() and parallelstream()
 collection = list (vector , ArrayList LinkedList)
 Queue = Dequeue (ArrayDequeue)
 set = sortedSet(HashSet , LinkedHashSet ,TreeSet)
// Collection is able to form the root or head of the hierarchy of interfaces in the java collection framework.
// Collections class uses static methods for computations, also known as utility methods that are used to operate on the collection.
  ArrayList = duplicate list 
  set = no duplicate list 
  difference between all these when to use all these at which conditions 
 */
/* boolean add()*/