package Thinkq;

import java.util.Scanner;

public class Bill {

	public static void main(String[] args) {
		
		int pizza=100;
        int puff=20;
        int cooldrink=10;
        
		Scanner sc= new Scanner(System.in);
		 System.out.println("enter the no of pizza");
		 int a= sc.nextInt();
		 System.out.println("enter the no of puff");
		 int b= sc.nextInt();
		 System.out.println("enter the no of cooldrink");
		 int d= sc.nextInt();
		 System.out.println("your bill is "+"pizza="+(pizza*a)+" puffs="+(puff*b)+" cooldrink="+(cooldrink*d));
	}    

}
