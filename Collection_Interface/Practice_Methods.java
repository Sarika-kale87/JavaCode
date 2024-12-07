package Collection_Interface;

import java.util.ArrayList;

public class Practice_Methods {

	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
          al.add("Sarika");
          al.add(70);
          al.add(4.6);
      System.out.println(al);    
        
      ArrayList al2=new ArrayList();
          al2.add(90);
          al2.add('d');
          al2.add("Ganesh");
          al2.add(8.9);
      System.out.println(al2);
      
      al.addAll(al2);
      System.out.println(al);
      //al.removeAll(al2);
      al.clear();
      
      System.out.println(al);
      
      
      
          
	}

}
