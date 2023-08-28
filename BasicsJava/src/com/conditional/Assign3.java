package com.conditional;

import java.util.Scanner;

public class Assign3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n1 = sc.nextInt();
		System.out.println("enter a number");
		int n2 = sc.nextInt();
		System.out.println("enter a number");
		int n3 = sc.nextInt();

		if (n1 > n2) {
			if (n1 > n3) {
				System.out.println(+n1 + "is greater");
			} else {
				System.out.println(n3 + "is greater");
			}
		} else if (n2 > n3) {
			System.out.println(n2 + "is greater");
		} else {
			System.out.println(n3 + "is grater");
		}
	}
}
