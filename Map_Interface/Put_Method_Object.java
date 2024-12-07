package Map_Interface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Put_Method_Object {

	public static void main(String[] args)
	{
		
          

   		Map<Object,Object> m2=new HashMap<Object,Object>();
		
		m2.put("Sarika", 37);
		m2.put("Ganesh", 40);
		m2.put("Shriya", 8);
		m2.put("Sharv", 4);
		
		System.out.println(m2);
		
		//m2.remove("Sarika");
		//System.out.println(m2);
		
		//m2.remove("Ganesh", 40);
		//System.out.println(m2);
		
		System.out.println(m2.get("Shriya"));
		
		
		
		
		
		
		
		
		
	}

}
