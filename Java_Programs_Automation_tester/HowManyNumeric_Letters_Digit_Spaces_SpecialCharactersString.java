package Java_Programs_Automation_tester;

import java.util.Arrays;

public class HowManyNumeric_Letters_Digit_Spaces_SpecialCharactersString {
	
	static int count=0;
	static int letter=0;
	static int spaces=0;

	public static void main(String[] args) {
		String name="My name is Sarika@1987";
		System.out.println(name.length());
        char c[]=name.toCharArray();
        
        System.out.println(Arrays.toString(c));
	for(int i=0;i<name.length();i++)
	{
		boolean b1=Character.isDigit(c[i]);
		boolean b2=Character.isLetter(c[i]);
		boolean b3=Character.isSpaceChar(c[i]);
		if(b1==true)
		{
			count++;
		}
		if(b2==true)
		{
			letter++;
		}
		if(b3==true)
		{
			spaces++;
		}
	}
		System.out.println(count);
		System.out.println(letter);
		System.out.println(spaces);
		int special_character=name.length()-(count+letter+spaces);
		System.out.println(special_character);
		
		
	}
	
	
	
	
	
	}


