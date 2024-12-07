package JavaAssignments.Scanner_Class_Java;

import java.util.Scanner;

public class Circumference_of_Triangle_Scanner_class
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the value of A=");
		int a=s.nextInt();
		
		System.out.println("Enter the value of B=");
		int b=s.nextInt();
		
		System.out.println("Enter the value of C=");
		int c=s.nextInt();
		
		int C1=a+b+c;
		System.out.println("Circumference of the Triangle="+C1);
		
	}

}
