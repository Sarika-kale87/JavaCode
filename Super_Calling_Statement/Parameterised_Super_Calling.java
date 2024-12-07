package Super_Calling_Statement;

class Google_Auth
{
	
	Google_Auth(int a)
	{
		
		System.out.println("Constructor 1");
	}
	
}


public class Parameterised_Super_Calling extends Google_Auth
{
	
	Parameterised_Super_Calling()
	{
		super(300);
		System.out.println("Constructor 2");
	}
   
	public static void main(String[] args) 
	{
	  new Parameterised_Super_Calling();
	}

}
