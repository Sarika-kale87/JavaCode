package Array_Programs;

public class ToCheckNoAvailability_Array {

	public static void main(String[] args) 
	{
		int rollno[]=new int [4];
		rollno[0]=10;
		rollno[1]=22;
		rollno[2]=15;
		rollno[3]=37;
		
		int given_no=15;
		
	for(int i=0;i<=3;i++)
	{
		if(given_no==rollno[i]) 
		{
          System.out.println("Yes Number Is Present");
          System.out.println("indexing is="+i);
		}
	}	
		
	}

}
