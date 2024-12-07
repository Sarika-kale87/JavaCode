package JavaAssignments.Constructor_Programs_Java;

public class constructoroverloading 
{   
	constructoroverloading(boolean b)
	{
		System.out.println("true");
	}
	constructoroverloading(int a)
	{
		System.out.println("this is a");
	}
	constructoroverloading(double d)
	{
		System.out.println("this is d");
		}
	constructoroverloading()
	{
		System.out.println("this is 4th");
		}

	public static void main(String[] args)
	{
		constructoroverloading c1=new constructoroverloading(true);
		new constructoroverloading(60);
		new constructoroverloading(40.8);
		new constructoroverloading();
		

	}

}
