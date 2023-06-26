package com.learn.sample.cuncurrency;

import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
	
	LinkedList<Integer> list =  new LinkedList<>();
	
	BlockingQueue<Integer> queue= null;
	
	
	public Consumer() {
		// TODO Auto-generated constructor stub
	}
	
	public Consumer(LinkedList<Integer> list) {
		this.list = list;
	}

	public Consumer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}
	
	
	public void consumer() throws InterruptedException {

		while (true) {
			synchronized (this) {

				while (list.size() == 0) {
					wait();
				}

				Integer remove = list.removeFirst();

				System.out.println("Consumer : " + remove);

				notify();

				Thread.sleep(1000);

			}
		}
	}

	@Override
	public void run() {
	try {

		while (true) {
			synchronized (this) {
				
				while (queue.take().intValue()==-1) {
					System.out.println(" going to wating state  : "+ Thread.currentThread().getName());
					wait();
				}

				System.out.println(" Consumer + "+queue);
				Integer remove = queue.poll();

				System.out.println("Consumer : " + remove);

				notify();

				Thread.sleep(1000);

			}
		}
	
		
	}catch (Exception e) {
		System.out.println("consumer thread");
		System.out.println(e);
	}
		
	}
}
