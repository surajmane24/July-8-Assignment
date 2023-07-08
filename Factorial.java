package com.aurionpro.test;
//For results switch to result branch
public class Factorial {

	public static void main(String[] args) {
		System.out.println("Find Factorial of a user entered number");
		
		int number = Integer.parseInt(args[0]);
		int fact = findFactorial(number);
		
		System.out.println("Factorial value of " + number + " is " + fact);
		
	}
	
	static int findFactorial(int number) {
		if(number == 0) {
			return 1;
		}
		else {
			return number*findFactorial(number-1);
		}
	}

}
