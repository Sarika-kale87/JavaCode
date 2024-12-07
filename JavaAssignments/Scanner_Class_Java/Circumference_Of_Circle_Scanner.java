package JavaAssignments.Scanner_Class_Java;

import java.util.Scanner;

public class Circumference_Of_Circle_Scanner 
{

	private static double pi;

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the value of r=");
		int r=s.nextInt();
	    pi = Math.PI;
		
		double c=2*pi*r;
		System.out.println("Circumferencs of circle="+c);
		
	}

}
