package SingleLevelInheritanceJava;
class Parent
{
	void add()
	{
		
	}
}
public class Nonstatic_both_programSLI extends Parent
{      
	void sub()
	{
		
	}

	public static void main(String[] args)
	{
		Nonstatic_both_programSLI n= new Nonstatic_both_programSLI();
		n.add();
		n.sub();
	}

}
