package JavaAssignments.Constructor_Programs_Java;

public class constructorAssignment 
    { 
	   static void add(int a, int b)
	   {
		   System.out.println(a+b);
	   }
	   
	  void age(int a)
	  {
		  System.out.println("this is non static");
	  }
	   
	  constructorAssignment()
	  {
		 
	  }
	  
	  constructorAssignment(double d)
	  {
		  System.out.println("this is constructor");
	  }
	
	public static void main(String[] args) 
	{
		add(8,90);
		constructorAssignment c= new constructorAssignment();
		c.age(30);
		constructorAssignment r2= new constructorAssignment(40.78);
		
		
		}

}
