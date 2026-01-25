package user;

import java.util.Scanner;

public class user_management {
	public static void user_management() {
	// public static void main (String [] args )   {
	System.out.println("***Welcome To User management***");
	System.out.println("-------------------------------------------");
	
	while(true ){
	System.out.println("**MENU**");
	System.out.println("1. Register New User");
	System.out.println("2. Login User");
	System.out.println("3. View User Profile ");
	System.out.println("4. Update User Details");
	System.out.println("5. Exit From User Management ");

	System.out.println("Entre your option");    
	Scanner sc = new Scanner(System.in);
	
	int option =sc.nextInt();
	
	switch(option) {
	case 1: 
		System.out.println("1. Register New User");
		break;
	case 2:
		System.out.println("2. Login User");
		break;
	case 3:
		System.out.println("3. View User Profile");
		break;
	case 4:
		System.out.println("4. Update User Details ");
		break;
	case 5 :
		System.out.println("Exit from user Mangemnt ");
        return;
	default : System.out.println("Invalid Option Choose ");
	
	
	}
	
	} 
	
	}

	

}
