package com.looplogic;

import java.util.Scanner;

public class KrishnaMurthy {

	static long fact(int num)// formal or dummy argument
	{
		int i = 1;
		int fact = 1;
		while (i <= num) {
			{
				fact *= i;
				i++;
			}

		}
		return fact;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		int org = num;
		int n1;
		long km = 0;
		while (num != 0) {
			n1 = num % 10;
			km += fact(n1);
			num /= 10;
		}
		if (org == km) {
			System.out.println("num is krishnamurthy");
		} else {
			System.out.println("num is not krishnamurthy");
		}
	}
}
