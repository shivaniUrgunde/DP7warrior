package com.conditional;

import java.util.Scanner;

public class Range {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		char n1 = sc.next().charAt(0);
		if((65>=n1)&&(n1<=90))
		{
			System.out.println("given nub is for capital A-Z");
		}
		else if((97>=n1)&&(n1<=122))
		{
			System.out.println("given nub is between a-z");
		}
		else if((33>=n1)&&(n1<=47))
		{
			System.out.println("special charecter");
		}
		else if((0>=n1)&&(n1<=9))
		{
			System.out.println("given number is inbetween 0-9");
		}
		else
		{
			System.out.println("given nub is not A-Z , no a-z , not special char and not in 0-9");
		}

	}

}
