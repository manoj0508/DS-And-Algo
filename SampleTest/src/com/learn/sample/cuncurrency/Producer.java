package com.learn.sample.cuncurrency;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Producer {
	
	LinkedList<Integer> list =  new LinkedList<>();
	
	
	
	public void produce() throws InterruptedException {
		
		int value = 0;
		
		while(true) {
			synchronized (this) {
				
				
				while(list.size() == 2) {
					wait();
				}
				
				System.out.println("Producer : "+ value);
				
				list.add(value++);
				
				notify();
				
				Thread.sleep(1000);
			}
		}
	}
	
	
	
	
	public void consumer() throws InterruptedException {
		
		while(true) {
			synchronized (list) {
			
				
				while(list.size()==0) {
					wait();
				}
				
				Integer remove = list.removeFirst();
				
				System.out.println("Consumer : "+remove);
				
				notify();
				
				Thread.sleep(1000);
				
			}
		}
	}

}
