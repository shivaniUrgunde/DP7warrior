package com.looplogic;

import java.util.Scanner;

public class Perfect {

	static void perfect(int num) {

		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		if (sum == num) {
			System.out.println("num is a perfect");
		} else {
			System.out.println("num is not a perfect");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		perfect(num);
	}

}
