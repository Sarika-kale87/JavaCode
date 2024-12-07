package Method_overriding_Super_Keyword;
class Google_Auth
{
	void login()
	{
		System.out.println("Login with mobile number");
	}
}
public class MethodOverriding1 extends Google_Auth
{
	void login()
	{   
		super.login();
		System.out.println("Login with email-id");
	}

	public static void main(String[] args)
	{
		MethodOverriding1 m1= new MethodOverriding1();
		m1.login();
		
	}

}
