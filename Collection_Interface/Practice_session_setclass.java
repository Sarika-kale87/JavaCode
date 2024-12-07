package Collection_Interface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Practice_session_setclass {

	   

		//Hashset,LinkedHashset class
		//SortedSet Set Interface.->NavigationSet>

		public static void main(String[] args) {
		// to check Set Interface properties
		//Converting child class object to Superclass is upcasting
		//we can not create object of interface so need to use child class which inherit the Set Interface so used HashSet class
		//set stores the value according to hashcode values
			Set objset=new HashSet();
		objset.add("Shital"); 
		objset.add("Yashoda");
		objset.add("Hema");
		objset.add('S');
		objset.add(123);
		objset.add(null);
		objset.add(null);// Set stores only unique value so stored only one null value as well.No Duplicate value 
		System.out.println(objset);// Set do not follow index and also order of insertion
		Iterator itr=objset.iterator(); //Iterator is appicable to whole collection hierachy .It is method to Traverse through collection one by one 
		while (itr.hasNext()) //has next method tells object is present or not.Return type is boolean 
		{
		System.out.println( itr.next());       //it returns the object
		}
		// Set objset1=new HashSet();
		// objset1.add("sneha");
		// objset1.add("sarika");
		//objset.addAll(objset1);
		//System.out.println(objset); //need to check sort method is working or not 
		 
		 

		}
}


