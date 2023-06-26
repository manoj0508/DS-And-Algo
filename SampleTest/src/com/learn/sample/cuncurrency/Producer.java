package com.learn.sample.cuncurrency;

import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{

	LinkedList<Integer> list = new LinkedList<>();
	BlockingQueue<Integer> queue= null;

	public Producer() {

	}

	public Producer(LinkedList<Integer> list) {
		this.list = list;
	}

	public Producer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}
	
	public void produce() {

		try {
		int value = 0;
		while (true) {
			synchronized (this) {

				while (list.size() == 1) {
					
					this.wait();
				}

			
				System.out.println("Producer : " + value);

				list.add(value++);

				notify();

				Thread.sleep(1000);
			}
		}
		
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	public void consumer(){

		try {
		while (true) {
			synchronized (this) {

				while (list.size() == 0) {
					this.wait();
				}

				Integer remove = list.removeFirst();

				System.out.println("Consumer : " + remove);

				notify();

				Thread.sleep(1000);

			}
		}
		}catch(Exception e) {
			System.out.println("Consumer Thread");
			System.out.println(e);
		}
	}

	@Override
	public void run() {


		try {
		int value = 0;
		while (true) {
			synchronized (this) {

				while (queue.size() == 2) {
					
					this.wait();
				}
				System.out.println(" Producer + "+queue);
				System.out.println("Producer : " + value);

				queue.put(value++);

				notify();

				Thread.sleep(1000);
			}
		}
		
		}catch(Exception e) {
			System.out.println(e);
		}
	
		
	}


}
