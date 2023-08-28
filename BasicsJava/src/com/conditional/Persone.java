package com.conditional;

import java.util.Scanner;

public class Persone {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter ur name");
		String name= sc.next();
		System.out.println("enter ur height");
		float height= sc.nextFloat();
		System.out.println("enter ur gender");
		char gender= sc.next().charAt(0);
		System.out.println("enter ur Age");
		int age= sc.nextInt();
		
		System.out.println("name- "+name+" height- "+height+" gener- "+gender+" Age- "+age);

	}

}
