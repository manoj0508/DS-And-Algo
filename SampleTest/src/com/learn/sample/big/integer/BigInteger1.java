package com.learn.sample.big.integer;

import java.math.BigInteger;
import java.util.Scanner;

public class BigInteger1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two value a and b ");
		String n1 = sc.next();
		String n2 = sc.next();
		
		
		BigInteger a = new BigInteger(n1);
		BigInteger b = new BigInteger(n2);
		BigInteger add =  a.add(b);
		BigInteger mul = a.multiply(b);
		System.out.println("Add of big integer value ");
		System.out.println(add);
		System.out.println("Multiplecation of Big Intgere value ");
		System.out.println(mul);
		
		sc.close();

	}

}
