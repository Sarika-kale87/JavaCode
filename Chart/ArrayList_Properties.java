package Chart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList_Properties {

	public static void main(String[] args)
	{
		
				
		ArrayList<Integer> s =new ArrayList<Integer>();
		
		s.add(20);
		s.add(4);
		s.add(8);
		s.add(50);
		System.out.println(s);
		
		
		Iterator i1= s.iterator();
		
		System.out.println("Using Forward Iteration");
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		ListIterator l1= s.listIterator();
		System.out.println("Using Listiterator Forward iteration");
		while(l1.hasNext())
		{
			System.out.println(l1.next());
		}
		System.out.println("Using Listiterator backward iteration");
		while(l1.hasPrevious())
		{
			System.out.println(l1.previous());
		}
		
		
		
		

	}

}
