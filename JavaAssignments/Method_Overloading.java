package JavaAssignments;

public class Method_Overloading 
{
	static void add()
	{
		System.out.println("This is static1");
	}
	
	static void add(int a)
	{
		System.out.println("This is static2");
	}
	void add(double d)
	{
		System.out.println("this is nonstatic");
	}
	
	public static void main(String[] args)
	{

		add();
		add(40);
		Method_Overloading m= new Method_Overloading();
		m.add(4.34);
		
	}

}
