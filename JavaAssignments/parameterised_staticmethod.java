package JavaAssignments;

public class parameterised_staticmethod {
	
	static void add(int a, int b)
	{
		System.out.println(a+b);
	}
	static void sub(double a, int b)
	{
		System.out.println(a-b);
	}
	static void login(String un, String pwd)
	{
		System.out.println("Login And Password");
	}

	public static void main(String[] args)
	
	{
	    add(800,200);
	    sub(90.40,80);
	    login("saru_pathak","Pathak@123");
		
	}

}
