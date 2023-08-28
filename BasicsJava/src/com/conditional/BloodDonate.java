package com.conditional;

import java.util.Scanner;

public class BloodDonate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		int age = sc.nextInt();
		System.out.println("enter your weight");
		int wt = sc.nextInt();

		if (age >= 18) {
			if (wt >= 70) {
				System.out.println("you can donate");
			} else {
				System.out.println("you are under weight");
			}
		} else {
			System.out.println("you cant donate your age is not 18");
		}

	}

}
