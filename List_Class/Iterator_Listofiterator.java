package List_Class;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterator_Listofiterator {

	public static void main(String[] args)
	{
		

		List l1=new ArrayList();
		
		l1.add(20);
		l1.add("Sarika");
		l1.add(7.5);
		l1.add(true);
		l1.add("Sun");
		l1.add(-30);
		
		System.out.println(l1);
		
		Iterator i1= l1.iterator();
		System.out.println("Using Iterator Forward Iteration: ");
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		ListIterator i2= l1.listIterator();
		System.out.println("Using ListIterator Forward Iteration:  ");
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		System.out.println("Using ListIterator Backward Iteration: ");
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
