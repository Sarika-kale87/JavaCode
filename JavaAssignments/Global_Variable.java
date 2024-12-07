package JavaAssignments;

public class Global_Variable 
{
	int a=20;// non static global variable 
	static double b=40.8;// static global variable
	
	public static void main(String[] args) 
	{
		b=30.2;// static global variable value updated
		System.out.println(b);
		Global_Variable g= new Global_Variable();
		System.out.println(g.b);
        g.a=100; // non static variable value updated
        System.out.println(g.a);
	}

}
