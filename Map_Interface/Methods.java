package Map_Interface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Methods {

	public static void main(String[] args) 
	{
		Map m1=new HashMap();
		
		List<String> i= new ArrayList<String>();
		
		Map<String,Integer> m2=new HashMap<String,Integer>();
		
		m2.put("Sarika", 37);
		m2.put("Ganesh", 40);
		m2.put("Shriya", 8);
		m2.put("Sharv", 4);
		
		System.out.println(m2);
		
		Map<String,Integer> m3=new HashMap<String,Integer>();
		
		m3.put("Jayashree", 67);
		m3.put("Dilip", 72);
		m3.put("Amit", 44);
		m3.put("Meena", 62);
	
		System.out.println(m3);
		m3.putAll(m2);
    
		System.out.println(m3);
		
	System.out.println(m2.equals(m3));
		
		
		
		
		
		
		
		
		
		

	}

}
