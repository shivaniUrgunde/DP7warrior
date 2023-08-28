package com.conditional;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a num");
		int a=sc.nextInt();
		if(a%2==0)
		   {
			System.out.println("num is even");
			}
		else
		{
			System.out.println("num is odd");
		}
        System.out.println("program endedS");
	}

}
