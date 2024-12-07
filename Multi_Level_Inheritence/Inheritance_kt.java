package Multi_Level_Inheritence;
class Google_auth
{
	void  method1(int a)
	{
		System.out.println("Method 1");
	}
	
}
class Amazon_login extends Google_auth
{
	void  method1(int b)
	{    
		
		System.out.println("Method 2");
		super.method1(90);
	}
	
}

public class Inheritance_kt extends  Amazon_login
{
	void  auth(String s)
	{
		System.out.println("Child class");
	}
	

	public static void main(String[] args)
	{
		Inheritance_kt i=new Inheritance_kt();
		i.auth("Sarika");
		i.method1(60);
		
		
	}

}
