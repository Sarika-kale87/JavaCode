package This_Keyword;

public class Assignment_59_This_Keyword 
{
     
	int age;
	String name;
	double salary;
	void employee_details(int age,String name,double salary)
	{
		this.age=age;
		this.name=name;
		this.salary=salary;
	}
	
	public static void main(String[] args)
	{
		Assignment_59_This_Keyword a1= new Assignment_59_This_Keyword();
		a1.employee_details(20,"Sarika",75000);
		System.out.println(a1.age);
		System.out.println(a1.name);
		System.out.println(a1.salary);

	}

}
