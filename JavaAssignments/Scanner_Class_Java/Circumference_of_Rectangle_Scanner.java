package JavaAssignments.Scanner_Class_Java;

import java.util.Scanner;

public class Circumference_of_Rectangle_Scanner {

	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the value of A=");
		int a=s.nextInt();
		
		System.out.println("Enter the value of B=");
		int b=s.nextInt();
		
		int c=2*(a+b);
		System.out.println("Circumference of Rectangle="+c);
		
	}

}
