package com.learn.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test2 {

	public static void main(String[] args) {
		

		Call call = (n) ->{
		    System.out.println(n);	
		};
		
		
		Call call1 = (n) ->{
		   int a = n-1;
		   System.out.println(a);
		};
		
		call.callPrint(0);
	
	}

}
