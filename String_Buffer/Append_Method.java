package String_Buffer;

public class Append_Method {

	public static void main(String[] args) 
	{
		StringBuffer s1= new StringBuffer("automation");
		s1.append(" testing");
		System.out.println(s1);
		
		StringBuilder s3= new StringBuilder("Automation");
		s3.append(" Testing");
		System.out.println(s3);

	}

}
