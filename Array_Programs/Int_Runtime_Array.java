package Array_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Int_Runtime_Array {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		
		int age[]=new int[4];
		for(int i=0;i<=3;i++)
		{
			System.out.println("Enter the value of age=");
		    age[i]=s1.nextInt();
		 
		}
		    
		System.out.println(Arrays.toString(age));
	}

}
