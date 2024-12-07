package Multi_Level_Inheritence;

public class one extends two
{
	
	static void login()
	
	{
	
	}

	public static void main(String[] args) 
	
	{
		login();
		login_auth();
		logout();

	}

}
class two extends three
{
	
	static void login_auth()
	{
		
	}
}
class three 
{
	
	static void logout()
	{
		
	}
	
}