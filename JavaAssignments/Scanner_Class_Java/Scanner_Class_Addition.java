package JavaAssignments.Scanner_Class_Java;

import java.util.Scanner;

public class Scanner_Class_Addition 
{

	public static void main(String[] args)
	{
		Scanner s1= new Scanner(System.in);
		
		System.out.println("Enter the value of a");
		 int a= s1.nextInt();
	
		 System.out.println("Enter the value of b");
		 int b=s1.nextInt();
		
		 int sum=a+b;
		 System.out.println("sum of 2 number is="+sum);
		
		 int sub=a-b;
		 System.out.println("sub of 2 number is="+sub);
		
		 int mul=a*b;
		 System.out.println("mul of 2 number is="+mul);
		
		 int div=a/b;
		 System.out.println("div of 2 number is="+div);
		
		 int mod=a%b;
		 System.out.println("mod of 2 number is="+mod);
		
		
		}

}
