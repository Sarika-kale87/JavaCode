package Array_Programs;

import java.util.Arrays;

public class Print_Reverse_Array {

	public static void main(String[] args) 
	{
		
		int input[]=new int[5];
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
		System.out.println(Arrays.toString(output));

	}

}
