package This_Keyword;

public class This_Keword_revision {
	//we use 'this' keyword in methods only. we can write on first line or any line inside nonstatic methods
	//This keyword is used when we want to assign value of local variable to global variable
	//its onl applicable if yr mathods parameters are same as global para.applicable only in nonstatic methods
	
	int age=37;
	String name="Sarika";
	
	void Employee_info(int age, String name)
	{
		this.age=age;
		this.name=name;
	}
	
	public static void main(String[] args)
	{
		This_Keword_revision t= new This_Keword_revision();
		t.Employee_info(40, "Ganesh");
		System.out.println(t.age);
		System.out.println(t.name);

	}

	
		
	}

	

