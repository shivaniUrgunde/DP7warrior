package com.conditional;

import java.util.Scanner;

public class Hdfc {

	public static void main(String[] args) {

		System.out.println("welcome to HDFC bank");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter pin");
		int pin = sc.nextInt();
		int bal = 25000;
		if (pin == 1234) {
			System.out.println("enter 1 cash widraw, 2 deposite cash, 3 Balance check, 4 exit");
			int ch = sc.nextInt();
			if (ch == 1) {
				System.out.println("ur bal is "+bal+" enter amount u have to widraw");
				int w1 = sc.nextInt();
				int wid = bal - w1;
				System.out.println("u are widraw " + w1 + " amount ur balance is " + wid);
			} else if (ch == 2) {
				System.out.println("enter amount u have to deposite");
				int w2 = sc.nextInt();
				int dip = bal + w2;
				System.out.println("u are widraw " + w2 + " amount ur balance is " + dip);
			} else if (ch == 3) {
				System.out.println(" ur balance is " + bal);
			} else if (ch == 4) {
				System.out.println("thanks you");
			}
		} else {
			System.out.println("pin is incorrect");
		}
	}

}
