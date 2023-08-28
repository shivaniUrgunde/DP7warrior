package com.loops;

public class Forloop {

	public static void main(String[] args) {
		int sum=0;
		int i;
		for( i=1;i<=20;i++)
		{
			if(i%2==0) {
				 sum+=i;}
				
				//break;
			//System.out.println(i);
		}
		System.out.println(sum);
	}

}
