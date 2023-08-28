package com.conditional;

import java.util.Scanner;

public class Operat {

	public static void main(String[] args) {
		 int a=200;
		 int b=10;
		 Scanner sc = new Scanner(System.in);
			System.out.println("enter your choice");
			String ch = sc.next();
	  switch(ch)
	  {
	  
	  case "add" : System.out.println("addition is "+(a+b));
	  break;
	  case "sub" : System.out.println("sub is "+(a-b));
	  break;
	  case "mul" : System.out.println("mul is "+(a*b));
	  break;
	  case "div" : System.out.println("div is "+(a%b));
	  
	  }

	}

}
