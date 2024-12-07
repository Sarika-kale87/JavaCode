package String_Buffer;

public class Insert_Replace_Delete_Method {

	public static void main(String[] args) 
	{
		StringBuffer s= new StringBuffer("Sarika Kale");
		//s.insert(7, "Ganesh ");
		// s.insert(7,4.6  );
		/* System.out.println(s);
		s.replace(0,6, "Shriya");*/
		
		/*System.out.println(s);
		s.replace(7,11, "Sharv");*/
		System.out.println(s);
		s.delete(7,12);
		System.out.println(s);

	}

}
