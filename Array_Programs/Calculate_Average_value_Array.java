package Array_Programs;

public class Calculate_Average_value_Array {

	public static void main(String[] args) 
	{
		double age[]=new double [5];
		age[0]=20;
		age[1]=35;
		age[2]=45;
		age[3]=67;
		age[4]=16;
		double sum=0;
		
		for(int i=0;i<age.length;i++)
		{
			
	       sum=sum+age[i];
		
		}
		System.out.println(sum);
		double average=sum/age.length;
		System.out.println(average);
		
		
		
		
	}

}
