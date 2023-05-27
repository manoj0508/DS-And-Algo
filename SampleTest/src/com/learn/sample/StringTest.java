package com.learn.sample;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  String test = "NoneicokiesProfile";
	  
	  String cok= "icokies";
	  
	  String[] split = test.split(cok);
	  
	  for(int i=0; i<split.length; i++) {
		  System.out.println(split[i]);
	  }
	  System.out.println(split);
	}

}
