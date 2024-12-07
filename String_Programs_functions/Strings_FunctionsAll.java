package String_Programs_functions;

public class Strings_FunctionsAll {

	public static void main(String[] args) 
	{
       String s= "School Of Pi";
         System.out.println( s.length());
         System.out.println(s.toLowerCase());
         
       String name="Sarika Kale        ";
       System.out.println(name.toUpperCase());
       
       System.out.println(name.trim());
       
       String a= "austelia";
       System.out.println(a.charAt(4));
       
       System.out.println(a.indexOf('t'));
       
       String z="Zurich";
       System.out.println(z.substring(3));
       System.out.println(z.substring(2, 5));
       
       System.out.println(z.equals("Zurich"));
       
       String s1="Shriya Sharv";
       System.out.println(s1.contains("Sha"));
       
       System.out.println(s1.equalsIgnoreCase("shriya sharv"));
       
        String b="abcde";
    char[]c1=b.toCharArray();
       
       
       
       
       
       

	}

}
