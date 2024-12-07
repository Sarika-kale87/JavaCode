package Java_Programs_Automation_tester;

public class Reverse_A_stringValue {

	public static void main(String[] args){//We can reverse the string by  
	//using charAt() as it will char datatype
	
		String Name= "Sarika";
		String reverse="";
		for(int i=Name.length()-1;i>=0;i--)
		{
			char c=Name.charAt(i);
			reverse=reverse+c;
		}
	    
		System.out.println(reverse);
		

	}

}
