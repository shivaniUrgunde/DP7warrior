package com.conditional;

import java.util.Scanner;

public class Assign1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter ur name");
		String s=sc.next();
		System.out.println("enter a mark sub1");
		int s1=sc.nextInt();
		System.out.println("enter a mark sub2");
		int s2=sc.nextInt();
		System.out.println("enter a mark sub3");
		int s3=sc.nextInt();
		System.out.println("enter a mark sub4");
		int s4=sc.nextInt();
		System.out.println("enter a mark sub5");
		int s5=sc.nextInt();
		int total=(s1+s2+s3+s4+s5);
		double per= ((total*100)/500);
		System.out.println(s+"ur per is"+per);
		if(per>=35)
		{
			System.out.println("congratulations ur pass");
		}
		else
		{
			System.out.println("sorry ur fail");
		}
		
	}

}
