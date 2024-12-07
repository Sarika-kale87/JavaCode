package Date;

import java.util.Date;

public class Current_Future_past_time {

	public static void main(String[] args) 
	{
		Date d1=new Date();
		System.out.println(d1.getTime());
		Date d2=new Date(d1.getTime());
		System.out.println("Present time is -"+d2);
		Date d3=new Date(d1.getTime()+(1000*60*60*24));
		System.out.println("Future time is -"+d3);
		Date d4=new Date(d1.getTime()-(1000*60*60*24));
		System.out.println("Past time is -"+d4);
		
		
		String humantime= d2.toString();
		humantime.substring(0, 0);

	}

}
