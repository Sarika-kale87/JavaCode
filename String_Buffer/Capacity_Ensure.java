package String_Buffer;

public class Capacity_Ensure {

	public static void main(String[] args)
	{
		StringBuffer s= new StringBuffer("Automation Testing");
		
		
		System.out.println(s.capacity());
		
		//int s1=s1.ensureCapacity(50);
		
	StringBuffer s1=new StringBuffer(20);
		
       s1.ensureCapacity(50);
       System.out.println(s1);
       String s3="Axem";
      System.out.println( s3.substring(1,3));
	}

}
