package Collection_Interface;

import java.util.ArrayList;
import java.util.Collection;

public class collection_Isempty_Method {

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
		
		c2.clear();
        System.out.println(c2);	
        
		
		 boolean b1=c2.isEmpty();
	     System.out.println(b1);
	     System.out.println(c1.isEmpty());
		
		

	}

}
