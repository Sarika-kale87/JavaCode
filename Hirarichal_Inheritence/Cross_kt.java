package Hirarichal_Inheritence;
class Google1
{
	void  add(int a)
	{
		System.out.println("Addition");
	}
}
class Amazon_1 extends Google1
{
	void sub()
	{
		System.out.println("Substraction");
	}
	
}
public class Cross_kt extends Google1
{

	public static void main(String[] args) 
	{
		Cross_kt c=new Cross_kt ();
		c.add(30);
		

	}

}
