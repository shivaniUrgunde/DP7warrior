package com.conditional;

import java.util.Scanner;

public class MovieTicket {

	public static void main(String[] args) {

		System.out.println("welcome to CityPride");
		System.out.println("1.Gadar  ratting=4.5  ticket price=250");
		System.out.println("2.Subhedar  ratting=4.8  ticket price=250");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your movie choice");
		int m1 = sc.nextInt();
		System.out.println("enter cupon code available press o for silver and 1 for gold");
		int cc = sc.nextInt();
		int price = 250;
		int bill;
		if (m1 == 1) {
			if (cc == 0) {
				System.out.println(
						"you are selected Gadar movie and you have sliver cupon code u are getting 50 rupees off ");
				bill = price - 50;
				System.out.println("price is" + bill);
			} else if (cc == 1) {
				System.out.println(
						"you are selected Gadar movie and you have sliver cupon code u are getting 100 rupees off ");
				bill = price - 100;
				System.out.println("price is" + bill);
			}
		} else if (m1 == 2) {
			if (cc == 0) {
				System.out.println(
						"you are selected Subhedar movie and you have sliver cupon code u are getting 50 rupees off ");
				bill = price - 50;
				System.out.println("price is" + bill);
			} else if (cc == 1) {
				System.out.println(
						"you are selected Gadar movie and you have sliver cupon code u are getting 100 rupees off ");
				bill = price - 100;
				System.out.println("price is" + bill);
			}
		}

	}

}
