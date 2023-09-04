package com.looplogic;

import java.util.Scanner;

public class SumOfDig {

	public static void main(String[] args) {
		int i=1;
		int sum=0;
		int count=0;
		while(i!=0)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the number");
			int num = sc.nextInt();
			count++;
			if(num==0)
			{
				break;
			}
			sum+=num;
			
		}
      System.out.println("sum of digit entered "+sum);
      System.out.println("total no entered "+count);
	}
  
}
