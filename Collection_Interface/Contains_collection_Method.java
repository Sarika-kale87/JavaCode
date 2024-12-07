package Collection_Interface;

import java.util.ArrayList;
import java.util.Collection;

public class Contains_collection_Method {

	public static void main(String[] args) 
	{
		Collection c1=new ArrayList();
		c1.add(20);
		c1.add('A');
		c1.add("Sarika");
		c1.add(8.80);
		c1.add(true);
		System.out.println(c1);
		
		Collection c2= new ArrayList();
		c2.addAll(c1);
		c2.add("Shriya");
		c2.add("Sharv");
		
		System.out.println(c2);
		
		  System.out.println(c1.contains("Sarika"));
	       System.out.println(c2.containsAll(c1));
	       
		
		
	}

}
