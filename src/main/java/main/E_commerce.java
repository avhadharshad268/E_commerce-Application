package main;

import java.util.Scanner;

public class E_commerce {

	public static void main (String [] args ) {
		System.out.println("*****Welcome To E-commerce Application*****");
		System.out.println("-------------------------------------------");
		System.out.println("Entre Login ID  and password  ");
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("\t Entre Login ID :-  ");
	    String  login_Id = sc.next();

		System.out.println("\t Entre password :-  ");
	    String password = sc.next();
	    
	    login(login_Id,password);
	   
	      
          
		
		
	}

	private static void login(String login_Id, String password) {
		// TODO Auto-generated method stub
		
	}
}
