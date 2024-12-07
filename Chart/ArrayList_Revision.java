package Chart;

import java.util.ArrayList;

public class ArrayList_Revision {
	
	//ArrayList: It is a class in list interface, it indexing=T, Dynamic=T, Heterogeneous=T, 
	//Sort=T, Null=T, Iterator=T, ListIterator=F, enumaration=F
	//ArrayList are non synchronized. can store any number of duplicates . follows insertion order

	public static void main(String[] args) {
		//1) Add(object): Adds any object, return type boolean
		//Add(index,object): adds object on given index no return type is void
		
	/*	ArrayList a =new ArrayList();
		a.add("Sarika");
		a.add("S");
		a.add("Sa");
		a.add("Saa");
		a.add("Sarika");
		a.add(null);
		a.add(null);
		a.add(0, 78);
		System.out.println(a);
		*/
		
		
		//2) AddAll(Collection): Adds two collections return type is boolean
		ArrayList a1 =new ArrayList();
		a1.add(45);
		a1.add('s');
		a1.add(5.5);
		a1.add(true);
		a1.add("Shriya");
		a1.add(null);
		a1.add(null);
		System.out.println(a1);
		//a.addAll(a1);		
		//System.out.println(a);
		
		//3)AddFirst(Object):Adds given object on '0'th index, return type void
		    
		     a1.addFirst(80);
		   System.out.println(a1);
		
		   //4)Remove(object):Removes perticular object, return type is object
		     a1.remove("Shriya");
		    System.out.println(a1);
		    
  
		
		

	}

}
