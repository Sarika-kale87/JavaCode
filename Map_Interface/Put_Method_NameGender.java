package Map_Interface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Put_Method_NameGender {

	public static void main(String[] args) 
	{
		
         Map m1=new HashMap();
		
		List<String> i= new ArrayList<String>();
		
		Map<String,Character> m2=new HashMap<String,Character>();
		
		m2.put("Sarika",'F');
		m2.put("Ganesh", 'M');
		m2.put("Shriya",'F');
		m2.put("Sharv", 'M');
		
		System.out.println(m2);
		
		System.out.println(m2.containsKey("Sharv"));
		System.out.println(m2.containsValue('M'));
		m2.clear();
		System.out.println(m2);
	System.out.println(m2.isEmpty());
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
