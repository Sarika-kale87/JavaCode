package Super_Calling_Statement;
class Google_2
{
	Google_2(String name)
	{
		System.out.println("Constructor 1");
	}
}
class Constru extends Google_2
{	
	Constru(int a)
	{
		super("SARIKA");
		System.out.println("Constructor 2");
	}
	
}

public class Multi_Level_Inheritence extends Constru
{
	Multi_Level_Inheritence()
	
	{
		super(80);
		System.out.println("Constructor 3");
	}


	public static void main(String[] args)
	{
		new Multi_Level_Inheritence();

	}

}
