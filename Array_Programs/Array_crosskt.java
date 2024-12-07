package Array_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Array_crosskt {

	public static void main(String[] args) 
	{
		//Array are used to store homogeneous(the values with same datatypes) values.
		//they are known for their fix size.
		//syntax: datatype[]=new datatype[size];
		//Methods:
		// 1) Arrays tostring for int
		// 2) Arrays.toString(null)=for int,float,double,boolean,byte,char,long,object,short
	
		int rollno[]=new int [4];
		rollno[0]=10;
		rollno[1]=22;
		rollno[2]=15;
		rollno[3]=37;
		
		System.out.println(Arrays.toString(rollno));
		
		boolean Statements[]=new boolean [5];
		Statements[0]=true;
		Statements[1]=true;
		Statements[2]=false;
		Statements[3]=false;
		Statements[4]=true;
		
		System.out.println(Arrays.toString(Statements));

		// 3) Using scannerclass runtime int array
		
		/*Scanner s1=new Scanner(System.in);
		
		int age[]=new int[4];
		for(int i=0;i<=3;i++)
		{
			System.out.println("Enter the value of age=");
		    age[i]=s1.nextInt();
		 
		}
		    
		System.out.println(Arrays.toString(age));*/
		
		// 4) print reverse array

		/*int input[]=new int[5];
		input[0]=5;
		input[1]=20;
		input[2]=16;
		input[3]=8;
		input[4]=5;
		int output[]=new int [input.length];
		
		for(int i=0,j=4;i<input.length;i++,j--)
		{
			output[j]=input[i];
		}
		
		System.out.println(Arrays.toString(input));
		System.out.println(Arrays.toString(output));*/
		
		// 5) Arrays.Equals = check if 2Arrays are equals
		
        /*Scanner s1=new Scanner(System.in);
		
		int age[]=new int [4];
		int age1[]=new int[4];
		
		for(int i=0;i<=3;i++)
		{
			System.out.println("Enter the value of index=");
			age[i]= s1.nextInt();
			age1[i]=s1.nextInt();
		}
	
	   System.out.println(Arrays.toString(age));
	   System.out.println(Arrays.toString(age1));
	   
	 boolean b1=  Arrays.equals(age, age1);
	 
	 System.out.println(b1); */
		
		// 6) Check no Availability
		
	/*	int rollno[]=new int [4];
		rollno[0]=10;
		rollno[1]=22;
		rollno[2]=15;
		rollno[3]=37;
		
		int given_no=15;
		
	for(int i=0;i<=3;i++)
	{
		if(given_no==rollno[i]) 
		{
          System.out.println("Yes Number Is Present");
          System.out.println("indexing is="+i); */
		}
		
		
		
		
	}
		

	


