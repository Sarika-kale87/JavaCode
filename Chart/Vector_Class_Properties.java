package Chart;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_Class_Properties {

	public static void main(String[] args) 
	{
		Vector<Integer> v= new Vector<Integer> ();
		v.add(20);
		v.add(50);
		v.add(90);
		v.add(30);
		v.add(10);
	   // Collections.sort(v);
		//System.out.println(v);
		
		ListIterator l1= v.listIterator();
		System.out.println("Using listiterator forward");
		while (l1.hasNext())
		{
			System.out.println(l1.hasNext());
		}
		System.out.println("Using Listiterator Reverse");
		while (l1.hasPrevious())
		{
			System.out.println(l1.previous());
		}
		
		
		
		
		
		
	}

}
