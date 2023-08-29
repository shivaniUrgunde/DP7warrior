package com.looplogic;

public class PrimeOrNot {
	static boolean prime(int num) {

		for (int i = 1; i <=num; i++)// if we want 2 save execution time then num divide by2 (i<num/2)
		{
			if (num % 2 == 0) {
				
			}
			
		}
		return true;
	}

	public static void main(String[] args) {

		boolean ans = prime(5);
		if (ans == true) {
			System.out.println("no is not prime");
		} else {
			System.out.println("no is  prime");
		}
	}

}
