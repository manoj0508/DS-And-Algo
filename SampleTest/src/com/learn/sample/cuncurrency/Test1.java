package com.learn.sample.cuncurrency;

import java.util.LinkedList;

public class Test1 {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<>();

		Producer producer = new Producer(list);

		

		Thread produceThread = new Thread(new Runnable() {
			public void run() {
				producer.produce();
			}
		});
		Thread consumerThread = new Thread(new Runnable() {
			public void run() {
				producer.consumer();
			}
		});

	

		produceThread.setName("producer Thread");
		consumerThread.setName("consumer thread");

		produceThread.start();
		consumerThread.start();

	}

}
