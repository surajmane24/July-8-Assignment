package com.aurionpro.test;
//For results switch to result branch
public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println("Printing Fibonacci Series: ");
		int number = Integer.parseInt(args[0]);
		fiboNumber(number);
		
	}
	
	static int fiboNumber(int number) {
		int a=0, b=1, nextTerm;
		System.out.print(a+", "+b+", ");
		for(int i=2; i<number; i++) {
			nextTerm = a+b;
			a=b;
			b=nextTerm;
			System.out.print(nextTerm+", ");
					
		}
		
		return number;
	}

}
