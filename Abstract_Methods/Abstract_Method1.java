package Abstract_Methods;
abstract class Google_Auth
{
	abstract void login();
	abstract void registration();
	static void add()
	{
		System.out.println("ADD");
	}
	void sub()
	{
		System.out.println("API");
	}
}
public class Abstract_Method1 extends Google_Auth
{
     void login() 
     {
		
		System.out.println("API 1");
	}

	
	void registration()
	{
		System.out.println("API 2");
	}


	public static void main(String[] args)
	{
		
		Abstract_Method1 a1=new Abstract_Method1();
		a1.login();
		a1.registration();
		a1.sub();
		
		
		
	}

	
	
}
