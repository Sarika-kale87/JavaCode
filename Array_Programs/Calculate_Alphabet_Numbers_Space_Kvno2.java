package Array_Programs;

import java.util.Arrays;

public class Calculate_Alphabet_Numbers_Space_Kvno2 
{
    static int countof_alphabet=0;
    static int countof_numeric=0;
    static int countof_space=0;
    
	public static void main(String[] args)
	{
		String a="Sarika Shriya Sharv25";
       char c1[]=a.toCharArray();
		System.out.println(Arrays.toString(c1));
	  
		for(int i=0;i<a.length();i++)
		{
			boolean v1=Character.isAlphabetic(c1[i]);
			boolean v2=Character.isDigit(c1[i]);
			boolean v3=Character.isWhitespace(c1[i]);
			
			if(v1==true)
			{
				countof_alphabet++;
			}
			if(v2==true)
			{
				countof_numeric++;
			}
			if(v3==true)
			{
				countof_space++;
			}
		}
			
		System.out.println(("count of alphabet is=")+countof_alphabet);
		System.out.println(("Count of number is=")+countof_numeric);
		System.out.println(("Count of space is=")+countof_space);
			
			
			
		}
		
		
		
		
	}


