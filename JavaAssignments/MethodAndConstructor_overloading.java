package JavaAssignments;

public class MethodAndConstructor_overloading
{

	static void sub()
	{
		System.out.println("Methd 1");
	}
	static void sub(int a, double n)
	{
		System.out.println("Methd 2");
	}
	
	MethodAndConstructor_overloading(double r)
	{
		System.out.println("Constructor 1");
	}
	
	MethodAndConstructor_overloading(double t,int p)
	{
		System.out.println("Constructor 2");
	}
	
	public static void main(String[] args)
	{
		sub();
		sub(90,3.7);
		MethodAndConstructor_overloading k1=new MethodAndConstructor_overloading(8.8);
		MethodAndConstructor_overloading k2=new MethodAndConstructor_overloading(3.7,30);
	}

}
