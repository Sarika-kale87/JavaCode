package Super_Calling_Statement;
class Google
{
	Google()
	{
		System.out.println("Google constructor");
	}
	
}
public class Amazon extends Google
{
  Amazon()
  {
	  super();
	  System.out.println("Amazon constructor");
  }
	public static void main(String[] args) 
	{
		new Amazon();

	}

}
