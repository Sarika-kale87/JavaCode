package JavaAssignments;

public class NonstaticMethod {

    void login()
    {
    	System.out.println("Login by number");
    }
     void logout()
     {
    	 System.out.println("Logout by number");
     }

public static void main(String[] args) 
   {
		NonstaticMethod nm = new NonstaticMethod();
	    nm.login();
	    nm.logout();
   
   }
}