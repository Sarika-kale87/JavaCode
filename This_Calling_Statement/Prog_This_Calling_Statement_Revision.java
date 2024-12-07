package This_Calling_Statement;

//  to call one constructor from another constructor within the class, we used this calling statement.
// it always should be on first line of any constructor.
//this calling statement Explcitly written no matter para or non para methods.
public class Prog_This_Calling_Statement_Revision {
	
	
	Prog_This_Calling_Statement_Revision(boolean b)
	{
	   this(6.7);
		System.out.println("A2");
		
	}
	Prog_This_Calling_Statement_Revision(Double d)
	{
	   
		System.out.println("A4");
		
	}
   
	Prog_This_Calling_Statement_Revision()
	{
	   this(true);
		System.out.println("A1");
		
	}
	
	public static void main(String[] args)
	{
		new Prog_This_Calling_Statement_Revision();

	}


	}


