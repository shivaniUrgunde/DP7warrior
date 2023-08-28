package com.conditional;

import java.util.Scanner;

public class PosNeg {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a num");
		int num=sc.nextInt();
		
		if(num>0)
		   {
			System.out.println("num is pos");
			}
		else
		{
			System.out.println("num is negative");
		}
     System.out.println("program endedS");

	}

}
