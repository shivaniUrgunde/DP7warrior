package com.loops;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int count = 0;
		// boolean flag=false;
		for (int i = 1; i < num; i++)// if we want 2 save execution time then num divide by2 (i<num/2)
		{
			if (num % 2 == 0) {
				count = 1;
				// flag=true;
				break;//
			}

		}
		if (count == 0) {
			System.out.println("no is prime");
		} else {
			System.out.println("no is not prime");
		}
		sc.close();
	}

}
