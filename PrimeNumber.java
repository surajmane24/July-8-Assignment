package com.aurionpro.test;

public class PrimeNumber {

	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		int i, mid, flag=0;
		mid = number/2;
		
		if (number == 0 || number == 1) {
			System.out.println(number + " is not a prime Number.");
		}
		else {
			for(i=2; i<=mid; i++) {
				if(number%i == 0) {
					System.out.println(number + " is Not prime number");
					flag = 1;
				}
				
				
			}
			if(flag == 0) {
				System.out.println(number + " is prime number");
			}
		}
	}

}
