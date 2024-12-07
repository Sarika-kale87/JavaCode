package String_Programs_functions;

public class String_Functions {

	public static void main(String[] args)
	{
		String name="sarika";
		  System.out.println(name.length());
		  System.out.println(name.toUpperCase());
		  
        String name1="Sarika Kale";
          System.out.println(name1.toLowerCase());
	
	    String name2=    "Sarika         ";
	    System.out.println(name2.trim());
	    
	    String n1="     I am girl";
	    System.out.println(n1);
	    
	    String a="India";
	    System.out.println(a.charAt(3));
	   
	    System.out.println(a.indexOf('n'));
	    
	    String s="Switzerland";
	    System.out.println(s.substring(5));
	    
	    System.out.println(s.substring(1, 6));
	   
	    System.out.println(s.equals(name1));
	    
	    System.out.println(s.contains("Sarika"));
	    
	    String s1="Automation";
	    
	    System.out.println(s1.equalsIgnoreCase("automation"));
	
	}

}
