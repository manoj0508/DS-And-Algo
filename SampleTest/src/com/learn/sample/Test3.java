package com.learn.sample;

import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Optional;
import java.util.function.Function;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * MyStack stack = new MyStack();
		 * 
		 * 
		 * System.out.println(stack);
		 * 
		 * stack.push(1); stack.push(2);
		 * 
		 * System.out.println(stack);
		 * 
		 * stack.pop();
		 * 
		 * System.out.println(stack);
		 * 
		 * stack.push(3); stack.push(4); stack.push(7);
		 * 
		 * System.out.println(" peak value " + stack.peak());
		 * 
		 * System.out.println(stack);
		 */
		
		ArrayDeque<Integer> dequeue = new ArrayDeque<>();
		
		dequeue.add(2);
		dequeue.push(3);
		dequeue.add(4);
		dequeue.push(5);
		dequeue.pop();
		dequeue.addFirst(5);
		dequeue.addLast(6);
	
		
		System.out.println(dequeue);
		
		//System.out.println(findAny);
		
		
		
		
		

	}

}
