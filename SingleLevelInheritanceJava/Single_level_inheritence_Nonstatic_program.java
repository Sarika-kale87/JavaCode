package SingleLevelInheritanceJava;
class Parent
{
	void add()
	{
		
	}
}
public class Single_level_inheritence_Nonstatic_program extends Parent
{
	static void sub()
	{
		
	}

	public static void main(String[] args) 
	{
		Single_level_inheritence_Nonstatic_program s=new Single_level_inheritence_Nonstatic_program();
		sub();
		s.add();

	}

}
