package Super_Calling_Statement;

//Super calling statement is used in java to call parent class constructor from child class constructor
//it is written always on first line of the constructor
//it is having 2 types: 1)Parameterized super calling statement: it is used to call parent class parameterised 
// cnstructor from child class constructor. 2)Non-Para super calling statement:It is used to call parent class
// non para constructor from child class constructor . this method can be written in 2 ways:
//i) implicitly:without writing.  
//ii) Explicitly:if we write it then it is known as explicitly. para SCS written only Explicitly.

class super_calling_statement_revision
{
	
	super_calling_statement_revision(int a)
	{
		System.out.println("Constructor 1");
	}


}

public class Revision_Session extends super_calling_statement_revision
 {
	 Revision_Session()
	 {
		 super(30);
		 System.out.println("Constructor 2");
	 }
	 
	 public static void main(String[] args) {
		 new Revision_Session ();
		 
	}
	 
	 
 }