package Collection_Interface;

import java.util.ArrayList;
import java.util.Collection;

public class RemoveAll_Method {

	public static void main(String[] args)
	{
		
Collection c1=new ArrayList();
		
		c1.add(20);
		c1.add('A');
		c1.add("Sarika");
		c1.add(8.80);
		c1.add(true);
		
		
		Collection c2= new ArrayList();
		
		c2.addAll(c1);
		c2.add("Shriya");
		c2.add("Sharv");
		System.out.println(c2);
		
		c2.removeAll(c1);
		System.out.println(c1);
		System.out.println(c2);
		
		
		int i=c2.size();
		System.out.println("Size of c2 is-"+i);
		
		
		
		
		
		
		
		
	}

}
