package JavaAssignments.Scanner_Class_Java;

import java.util.Scanner;

public class Circumference_of_Squre_scanner {

	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the value of A=");
		int a=s.nextInt();
		
		int c=4*a;
		System.out.println("Circumference of Square="+c);
	}

}
