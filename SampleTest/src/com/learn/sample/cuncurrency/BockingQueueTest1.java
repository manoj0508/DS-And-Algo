package com.learn.sample.cuncurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BockingQueueTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final BlockingQueue<Integer> queue= new ArrayBlockingQueue<>(10);
		
		Producer producer = new Producer(queue);
		
		Consumer consumer = new Consumer(queue);
		
		Thread producerThread = new Thread(producer);
		producerThread.setName("Producer Thread");
		Thread consumerThread = new Thread(consumer);
		consumerThread.setName("Consumer Thread");
		
		producerThread.start();
		consumerThread.start();
	}
	
	

}
