package String_Buffer;

public class Reverse_Charat_Capacity_Substring {

	public static void main(String[] args)
	{
		
		StringBuffer s= new StringBuffer("Automation Testing");
		
		System.out.println(s.length());
		
    	System.out.println(s.capacity());//initial capacity+length of the string
    	
    	System.out.println(s.charAt(7));
    	
    	System.out.println(s.substring(5));
    	
    	System.out.println(s.substring(0,10));
		
    	System.out.println(s.reverse());

	}

}
