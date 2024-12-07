package String_Programs_functions;

public class String_ReverseString {

	public static void main(String[] args) 
	{
		String input="Automation";
		String output="";
		
		for(int i=input.length()-1;i>=0;i--)
	{
		
		char c1= input.charAt(i);
		output=output+c1;
	
	}
		
		System.out.println(output);
		
	}

}
