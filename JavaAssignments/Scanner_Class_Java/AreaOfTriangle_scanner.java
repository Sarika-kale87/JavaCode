package JavaAssignments.Scanner_Class_Java;

import java.util.Scanner;

public class AreaOfTriangle_scanner {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the value of B=");
		int b=s1.nextInt();
		
		System.out.println("Enter the value of H=");
		int h=s1.nextInt();
		
		double a=0.5*b*h;
		System.out.println(a);

	}

}
