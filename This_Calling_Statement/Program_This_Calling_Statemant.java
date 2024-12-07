package This_Calling_Statement;

public class Program_This_Calling_Statemant 
{
	Program_This_Calling_Statemant (boolean b)
		{   
		    
			System.out.println("true");
		}
	Program_This_Calling_Statemant (int a)
		{   
		    this(4.5);
			System.out.println("this is a");
		}
	Program_This_Calling_Statemant (double d)
		{   
		    this(true);
			System.out.println("this is d");
			}
	Program_This_Calling_Statemant ()
		{
		    this(40);
			System.out.println("this is 4th");
			}

		public static void main(String[] args)
		{
			new Program_This_Calling_Statemant ();
			
			

		}
	}


