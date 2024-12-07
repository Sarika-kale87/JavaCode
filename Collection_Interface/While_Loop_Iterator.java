package Collection_Interface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class While_Loop_Iterator {

	public static void main(String[] args) 
	{

		Collection c1=new ArrayList();
		c1.add(20);
		c1.add('A');
		c1.add("Sarika");
		c1.add(8.80);
		c1.add(true);
		System.out.println(c1);
		
		Iterator i1= c1.iterator();
		
		while(i1.hasNext())

		{
			System.out.println(i1.next());
		}
		
		
		
		

	}

}
