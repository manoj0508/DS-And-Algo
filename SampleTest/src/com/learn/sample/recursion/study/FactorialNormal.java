package com.learn.sample.recursion.study;

import java.math.BigInteger;

public class FactorialNormal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 100;
		BigInteger sum = new BigInteger("1");
		BigInteger subtract = sum.subtract(new BigInteger("1"));

		System.out.println("sum : " + sum + " substract : " + subtract);

		 normalFactorial(n);

		// int factorial = factorial(n);
		// System.out.println("recursion result : "+ factorial);

	}

	public static void normalFactorial(int n) {
		// long sum = 1;
		BigInteger sum = new BigInteger("1");
		System.out.println("1 sum = " + sum);
		BigInteger valueOne = new BigInteger("1");
		BigInteger i = new BigInteger(String.valueOf(n));
		while (i.intValue() > 1) {

			sum = sum.multiply(i);
			i = i.subtract(valueOne);

			System.out.println("i : " + i);
			System.out.println("loop , sum : " + sum);
		}

		System.out.println("result : " + sum);

	}

	public static int factorial(int n) {

		if (n == 1) {
			return 1;
		}

		return n * factorial(n - 1);
	}

}
