package Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class Clear_Isempty_methods {

	public static void main(String[] args)
	{
		Map<Object,Object> m= new HashMap<Object,Object>();
		m.put("Sugar",2);
		m.put("Rice", 5);
		m.put("Lentils", 3);
		m.put("Beans",5);
		System.out.println(m);
		
		m.clear();
		System.out.println(m);
		
	System.out.println(	m.isEmpty());
		

	}

}
