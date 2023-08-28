package com.conditional;

import java.util.Scanner;

public class Assign2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int n1=sc.nextInt();
		
		if((n1%5==0)&&(n1%10==0))
		{
			System.out.println("given nub is divisible by 5 and 11");
		}
		else
		{
			System.out.println("not divisible");
		}
	}

}
