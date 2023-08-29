package com.loops;

import java.util.Scanner;

public class PartTym {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the part time hour");
		int pt = sc.nextInt();
		int pr = 100;
		int sal = 0;
		for (int i = 1; i <= pt; i++) {
			sal = i * pr;
		}
		sal *= 365;
		System.out.println("total sal is " + sal);
		sc.close();
	}

}
