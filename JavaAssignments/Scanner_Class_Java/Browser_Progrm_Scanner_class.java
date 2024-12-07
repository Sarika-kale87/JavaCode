package JavaAssignments.Scanner_Class_Java;

import java.util.Scanner;

public class Browser_Progrm_Scanner_class {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		
		System.out.println("please enter the number to launch the browser");
		int input=s1.nextInt();
		
		switch(input)
	{
	     case 1:
	    	 System.out.println("Chrome browser");
	    	  break;
	    	  
	     case 2:
	    	 System.out.println("mozilla browser");
	    	  break;
	     
	     case 3:
	    	 System.out.println("Internet Explorer browser");
	    	  break;
		
	     case 4:
	    	 System.out.println("Edge browser");
	    	  break;
         
	     default:
	    	 System.out.println("please enter correct value=");
	}

}
}
