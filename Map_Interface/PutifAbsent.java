package Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class PutifAbsent {

	public static void main(String[] args)
	{
		Map<String,String> m= new HashMap<String,String> ();
		
		m.put("Sa", "SGK01");
		m.put("Re", "SGK07");
		m.put("Ga", "SGK25");
		m.put("Ma", "SGK30");
		m.put("Pa", "SGK17");
		
		System.out.println(m);
		m.putIfAbsent("Dha", "SGK87");
		System.out.println(m);
		
		
		
		
		

	}

}
