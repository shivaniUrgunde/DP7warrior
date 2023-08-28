package com.conditional;

import java.util.Scanner;

public class MbaMca {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your course choice 1. mba , 2. mca");
		int ch = sc.nextInt();

		switch (ch) {
		case 1:
			System.out.println("welcome to mba course");
			System.out.println("enter your percentage");
			int per = sc.nextInt();
			switch (1) {

			case 1:
				if (per >= 60) {
					System.out.println("you are able to enroll ");
				} 

			case 2:
				if (per >= 75) {
					System.out.println("you are able to enroll direct 2nd year");
				} else {
					System.out.println("better luck next time");
				}
				break;

			}
			break;
		case 2:
			System.out.println("welcome to mba course");
			System.out.println("enter your percentage");
			int perc = sc.nextInt();
			switch (1) {

			case 1:
				if (perc >= 60) {
					System.out.println("you are able to enroll");
				} 
			case 2:
				if (perc >= 75) {
					System.out.println("you are able to enroll direct 2nd year");
				} else {
					System.out.println("better luck next time");
				}

				break;

			}

		}
	}

}
