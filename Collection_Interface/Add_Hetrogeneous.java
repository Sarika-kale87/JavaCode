package Collection_Interface;

import java.util.ArrayList;
import java.util.Collection;

public class Add_Hetrogeneous {

	public static void main(String[] args)
	{
		Collection c1= new ArrayList();
		
		c1.add(20);
		c1.add('A');
		c1.add("Sarika");
		c1.add(8.80);
		c1.add(true);
		
		System.out.println(c1);
		
	}

}