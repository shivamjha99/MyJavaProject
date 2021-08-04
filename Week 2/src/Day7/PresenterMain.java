package Day7;

import java.util.Scanner;

public class PresenterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Username (Only alphanumeric");
		String username=sc.nextLine();
		System.out.println("Password (Alphanumeric and special character like@&_.)");
		String password=sc.nextLine();
	 BusinessValidation ex=new BusinessValidation();
        try {
          if(ex.isValidUserName(username))
          {
        	  System.out.println("Valid Username");
          }
        }
        catch(InvalidUserNameException e)
        {
        	System.out.println(e.getMessage());
        }
        try {
            if(ex.isValidPassword(password))
            {
          	  System.out.println("Valid Password");
            }
          }
          catch(InvalisPasswordException e)
          {
          	System.out.println(e.getMessage());
          }
	}

}
