package com.looplogic;

public class MethodLogic {
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
		fact(9);// actual argument
		long ans = fact(7);
		System.out.println("factorial is" + ans);
	}

}
