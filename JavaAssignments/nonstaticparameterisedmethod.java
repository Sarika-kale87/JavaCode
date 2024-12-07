package JavaAssignments;

public class nonstaticparameterisedmethod 

{
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	void sub(int d, int c)
	{
		System.out.println(d-c);
	}

    public static void main(String[] args) 
    {
    	nonstaticparameterisedmethod n1=new nonstaticparameterisedmethod();
             n1.add(40,70);
             n1.sub(50,30);
          
    }
		
}
