package basicsprograms;

public class LogicalOperatorNOTAnd {

 public static void main(String[] args) 
 {
	int a=100;
	int b=200;
	
	if(!(a!=b && a==b))
	{
		System.out.println("True");
	}
	else
	{
		System.out.println("False");
	}
	
 }
}
