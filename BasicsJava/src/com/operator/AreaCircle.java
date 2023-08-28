package com.operator;

import java.util.Scanner;

public class AreaCircle {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 System.out.println("enter the radious of cicle");
		 double r=sc.nextDouble();
		 double a=Math.PI*Math.pow(r, 2);
		 System.out.println("area of circle="+a);

	}

}
