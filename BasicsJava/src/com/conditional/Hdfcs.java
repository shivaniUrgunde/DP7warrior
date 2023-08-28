package com.conditional;

import java.util.Scanner;

public class Hdfcs {

	public static void main(String[] args) {

		System.out.println("welcome to HDFC bank");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter pin");
		int pin = sc.nextInt();
		int bal = 25000;

		if (pin == 1234) {
			System.out.println("enter wid= cash widraw, dip= deposite cash, check= Balance check");
			String ch = sc.next();
			switch (ch) {
			case "wid":
				System.out.println("ur bal is " + bal + " enter amount u have to widraw");
				int w1 = sc.nextInt();
				int wid = bal - w1;
				System.out.println("u are widraw " + w1 + " amount ur balance is " + wid);
				break;

			case "dip":
				System.out.println("enter amount u have to deposite");
				int w2 = sc.nextInt();
				int dip = bal + w2;
				System.out.println("u are widraw " + w2 + " amount ur balance is " + dip);
				break;

			case "check":
				System.out.println(" ur balance is " + bal);
				break;

			default:
				System.out.println("you entered wrong choice thank you");
			}
		}

	}

}
