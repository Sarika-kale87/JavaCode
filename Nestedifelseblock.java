package basicsprograms;

public class Nestedifelseblock {

	public static void main(String[] args) 
	
	{
     int a=30;
     int b=50;
     int c=30;
    
     if(a==b) 
     {
	     if(a!=c)
	     {
	    	 System.out.println("S1");
	     }
	     else
	     {
	    	 System.out.println("R1");
	     }
    	 
     }
     else
     {
	 System.out.println("False");
    	 
     }
	}

}
