package com.conditional;

import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number whose factor u have to find");
		int num = sc.nextInt();
		System.out.println("enter factor u have to find");
		int fa = sc.nextInt();
		if (fa > 0) {
			if (num % fa == 0) {
				System.out.println(fa + "is a factor of" + num);
			} else {
				System.out.println(fa + "is not a factor of" + num);
			}
		} else {
			System.out.println("negative factor is not allowed");
		}
	}

}
