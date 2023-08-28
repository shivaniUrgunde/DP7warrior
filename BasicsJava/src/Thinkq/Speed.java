package Thinkq;

import java.util.Scanner;

public class Speed {

	public static void main(String[] args) {
		double speed;
		Scanner sc= new Scanner(System.in);
		 System.out.println("enter the distance");
		 double dis= sc.nextInt();
		 System.out.println("enter the time");
		 double time= sc.nextInt();
		 System.out.println(speed=dis/time);
		 sc.close();
	}

}
