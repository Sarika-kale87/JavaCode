package JavaAssignments;

public class Method_overloading5static5nonstatic
{
	static void add()
	{
		System.out.println("static1");
	}
	static void add(int a)
	{
		System.out.println("static2");
	}
	static void add(int d,int g)
	{
		System.out.println("static3");
	}
	static void add(boolean b)
	{
		System.out.println("static4");
	}
	static void add(boolean n,int q)
	{
		System.out.println("static5");
	}
	void add(double f)
	{
		System.out.println("nonstatic1");
	}
	
	 void add(double r, int h)
	{
		System.out.println("nonstatic2");
	}
	
	void add(int q,double j)
	{
		System.out.println("nonstatic3");
	}
	
	void add(double t, double m)
	{
		System.out.println("nonstatic4");
	}
	
	void add(boolean u, boolean j)
	{
		System.out.println("nonstatic5");
	}
	
	public static void main(String[] args) 
	{
		add();
		add(50);
		add(5,9);
		add(true);
		add(false,90);
		Method_overloading5static5nonstatic b= new Method_overloading5static5nonstatic();
		b.add(7.9);
		b.add(5.5, 9);
		b.add(2, 1.8);
		b.add(3.8, 2.2);
		b.add(true, false);

	}

}
