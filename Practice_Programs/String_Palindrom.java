package Practice_Programs;

public class String_Palindrom {

	public static void main(String[] args) 
	{
		
		String s1="sarika";
		String output="";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			char c=s1.charAt(i);
			output=output+c;
		}
		System.out.println(output);
		if(s1.equals(output)==true)
		{
			System.out.println("It is palindrom");
		}
		else
		{
			System.out.println("It is not palindrom");
		}
		
		
		
		
		
		
		
	}

}
