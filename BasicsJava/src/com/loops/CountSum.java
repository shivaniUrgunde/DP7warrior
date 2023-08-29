package com.loops;

import java.util.Scanner;

public class CountSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the start num");
		int start = sc.nextInt();
		System.out.println("enter the end num");
		int end = sc.nextInt();
		int countev = 0;
		int countodd = 0;
		for (int i = start; i <= end; i++) {
			if (start % 2 == 0) {
				countev += start;
			}
			if (start % 2 != 0) {
				countodd += start;
			}
			start++;

		}
		System.out.println("count of even no " + countev);
		System.out.println("count of odd no " + countodd);
		sc.close();
	}

}
