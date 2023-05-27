package com.learn.sample.gfg.problems;

import com.learn.sample.StringTest;

public class RemoveSpace {

	public static void main(String[] args) {
		
		String S = "    g f g";
		
		String trim = S.replace(" ", "");
		
		System.out.println(trim);
		
		String s ="ababaaaaaa", x = "abaa";
		
		System.out.println(strstr(s, x));
		System.out.print(strstr1(s, x));

	}
	
	
	public static int strstr(String s, String x)
    {
       // Your code here
		int index=-1;
		
		if(s.length()>0 && x.length()>0) {
			char[] xArray = x.toCharArray();
			char[] sArray = s.toCharArray();
			
			int i=0, j =0;
			
				while(j<sArray.length){
					
					if(xArray[i]== sArray[j]) {
						index =j;
						if(xArray.length>0) {
						
						while(i<xArray.length) {
							
							if(xArray[i]!=sArray[j]) {
								break;
							}
							i++; j++;
						}
						if(i==xArray.length) {
							break;
						}
					 }else {
						 index =j;
						 break;
					 }
					}
					
				
					if(i!=0 && i<xArray.length) {
						i=0;
						index = -1;
					}
					
					j++;
				}
				
				
			}
		
		return index;
    }
	
	public static int strstr1(String s, String x) {
		
		
		return s.indexOf(x);
	}

}
