package JavaAssignments.Scanner_Class_Java;

import java.util.Scanner;

public class Area_Of_Circle_Scanner {

	

	private static double pi;

	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		
		System.out.println("Enter the value of radious=");
		int r=s1.nextInt();
		
		pi = Math.PI;
		double a=(pi*r*r);
		System.out.println("Area of Circle ="+a);
		
		
	}

}
