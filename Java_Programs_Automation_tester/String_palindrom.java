package Java_Programs_Automation_tester;

public class String_palindrom {

	public static void main(String[] args) {
		String s="mom";
		String reverse="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char c=s.charAt(i);
			reverse=reverse+c;
		}
       System.out.println(reverse);
     boolean b=s.equals(reverse);
     if(b==true)
     {
    	 System.out.println("It is palindrom");
     }
	}

}
