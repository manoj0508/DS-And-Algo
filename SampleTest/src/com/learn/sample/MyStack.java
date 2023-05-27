package com.learn.sample;

public class MyStack {
	
	
	int [] array =new int [10];
	
	int pointer=-1;
	
	public void push(int data) {
		
		pointer++;
		if(pointer <= array.length) {
			array[pointer] = data;
		}
	}
	
	public void pop() {
		
		if(pointer >-1) {
			pointer--;
		}
	}
	
	public int peak() {
		if(pointer>-1) {
			return array[pointer];
		}
		return -1;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("[");
		
		if(pointer>-1) {
			result.append(array[0]);
		for(int i=1; i<=pointer; i++) {
		
			result.append(","+array[i]);
		}
		}
		result.append("]");
		return result.toString();
	}
}
