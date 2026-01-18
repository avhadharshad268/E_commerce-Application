package login;

import java.util.Scanner;

public class login {

	public static void login() {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("\t Entre Login ID :-  ");
	    String  login_Id = sc.next();

		System.out.println("\t Entre password :-  ");
	    String password = sc.next();
	    
	    if (login_Id.equals("user") && password.equals("123")) {
    	    System.out.println("✅ Access Granted");
    	    return;
       } else {
    	    System.out.println("✅ Access Diened ");
    	    System.exit(0);
       }

		
	}
}

