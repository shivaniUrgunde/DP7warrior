package com.looplogic;

import java.util.Scanner;

public class ExtractDigit {
	static void extract(int num) {

		while (num != 0) {
			System.out.println(num % 10);
			num /= 10;
		}

	}

	static void reverse(int num) {
		int rev = 0;
		while (num != 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		System.out.println(rev);
	}

	static void palindrome(int num) {
		int org = num;
		int rev = 0;
		while (num != 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		if (org == rev) {
			System.out.println("num is palindrome");
		} else {
			System.out.println("not palindrome");
		}
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		extract(num);
		reverse(num);
		palindrome(num);
		
	}

}
