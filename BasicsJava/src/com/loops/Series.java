package com.loops;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of birthda");
		int num = sc.nextInt();
		int coin = 0;

		for (int i = 1; i <= num; i++) {
			coin = i * i * i;
			System.out.println("coin on " + i + " birthday= " + coin);

		}
		sc.close();
	}

}
