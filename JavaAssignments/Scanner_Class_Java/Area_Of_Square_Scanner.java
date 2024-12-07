package JavaAssignments.Scanner_Class_Java;

import java.util.Scanner;

public class Area_Of_Square_Scanner
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	
	System.out.println("enter the value of L=");
	int l=s.nextInt();
	
	System.out.println("enter the value of B=");
	int b=s.nextInt();
	
	int a=l*b;
	System.out.println("Area of Square="+a);
	
}
	
	
}
