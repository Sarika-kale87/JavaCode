package JavaAssignments.Scanner_Class_Java;

import java.util.Scanner;

public class area_of_Rectangle_scanner {

	public static void main(String[] args) 
	{
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the value of a=");
		int l=s.nextInt();
		
		System.out.println("Enter the value of w=");
		int w=s.nextInt();
		
		int a=l*w;
		System.out.println("Area of rectangle="+a);
		
		
		}

}
