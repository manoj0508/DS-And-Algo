package com.learn.sample.cuncurrency;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConcurrenyTest1 {

	public static void main(String[] args) throws InterruptedException {
		{
	        // Object of a class that has both produce()
	        // and consume() methods
	        final PC pc = new PC();
	 
	        // Create producer thread
	        Thread t1 = new Thread(new Runnable() {
	            @Override
	            public void run()
	            {
	                try {
	                    pc.produce();
	                }
	                catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        });
	 
	        // Create consumer thread
	        Thread t2 = new Thread(new Runnable() {
	            @Override
	            public void run()
	            {
	                try {
	                    pc.consume();
	                }
	                catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        });
	 
	        // Start both threads
	        t1.start();
	        t2.start();
	 
	        // t1 finishes before t2
	        
	        
	    }
	 
	}

}