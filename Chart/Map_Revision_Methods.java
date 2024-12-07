package Chart;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Revision_Methods {

	public static void main(String[] args) 
	{
		//Map is an inteface. We can access its methods by upcasting its classes(HashMap)
		//They always store the value in form of key and value
	//Indexing=F, Dynamic=T, Null=only1, duplicates=F, Sort=F, Heterogeneous=T
		//Iterator=T, ListIterator=F, Enamorator=F
		
		Map<String,String> m= new HashMap<String,String>();
		m.put("Sarita","SA90");
		m.put("shravya", "SH30");
		m.put("Sharvi", "MN17");
		m.put("Ganesha","Bn25");
		System.out.println(m);
		
		Map<String,String> m1= new HashMap<String,String>();
		m1.put("Sarika","SK01");
		m1.put("Sarika","SK01");
		m1.put(null,null);
		m1.put("Ganesh","GK25");
		System.out.println(m1);
		
		//Raplace:to replace new value,(String key,Old value,new value)
		m1.replace("Sarika", "SK01", "SP01");
		System.out.println(m1);
		
		//equals: it will checkthe given maps are equals or not and returns boolean value
	System.out.println(	m1.equals(m));
		
	// m1.putAll(m);
   //  System.out.println(m1); 
     
     // Clear():to remove all keys and values of map
     
    // m1.clear();
     //System.out.println(m1); 
     
     //isEmpty ():Checks if the given map is empty or not
     //System.out.println (m1.isEmpty()); 
     
     // Remove(Object key): method can be used for removing key(if there is no key then there is no value)
     //remove(object key,object value): one more remove method we have in map 
    // m1.remove("Sharv");
    
		//m1.remove("Ganesh", "GK25");
   //  System.out.println(m1); 
        
       //putIfAbsent():it will check if the given key and value is present in the map or 
		//not if it is absent then it will get added in the map.
    // m1.putIfAbsent("Jayashree", "JP1958");
     //System.out.println(m1);
    
	//For putAll Method we have to always use same datatypes for both maps  
		
		//We can iterate map interface using Keyset(),Values(),Entryset()
		//Keyset()=We can iterate keys 
		//Values()=we can iterate values
		//Entryset()=we can iterate Entries
      
      /* System.out.println("Fetching all keys :");
       
       for(String s1: m1.keySet())
       {
    	   System.out.println(s1);
       }
       
       System.out.println("Fetching all Values :");   
       
    	for(String s2:m1.values())   
       
    	  {
    		  System.out.println(s2);
    	  }
	
    	  System.out.println("Fetching all Entries:"); 
          
          
          for(Entry<String, String> s:  m1.entrySet())
          {
       	   System.out.println(s);
          }
          
       // we can use iterator as well in map.
         
        Set<Entry<String,String>> s1=m1.entrySet();
        Iterator<Entry<String,String>> i=s1.iterator();
        System.out.println("Return Entries using iterator:");
         while(i.hasNext())
         {
        	 System.out.println(i.next());
         }*/
		
        
        
		
		
		
		
		
	}
}


