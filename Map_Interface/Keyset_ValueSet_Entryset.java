package Map_Interface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Keyset_ValueSet_Entryset {

	public static void main(String[] args) 
	{
		
		Map<String,String> m= new HashMap<String,String>();
		
		m.put("Sarika", "1987");
		m.put("Ganesh", "1984");
		m.put("Shriya", "2016");
		m.put("Sharv", "2020");
		m.put("Amit", "1980");
		
		System.out.println(m);
		System.out.println("Return Keys:-");
		for (String s1:m.keySet())
		{
			System.out.println(s1);
		}
		System.out.println("Return Values:-");
		for(String s2:m.values())
		{
			System.out.println(s2);
		}
		System.out.println("Return Entries:-");
		for(Entry<String, String> s3:m.entrySet())
		{
			System.out.println(s3);
		}
		
		Set <Entry <String,String>> s4= m.entrySet();
		Iterator <Entry<String,String>> i = s4.iterator();
		System.out.println("Return Entries Using Iterator:-");
		while (i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
	}

}
