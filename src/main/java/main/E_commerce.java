package main;

import java.util.Scanner;

import login.login;

public class E_commerce {

	public static void main (String [] args ) {
		System.out.println("*****Welcome To E-commerce Application*****");
		System.out.println("-------------------------------------------");
		System.out.println("Entre Login ID  and password  ");
		
        login.login();
        Scanner sc = new Scanner(System.in);
        int option ;
        
        while (true) {
    		System.out.println("*MENU*");
    		System.out.println("1. Product Mangement");
    		System.out.println("2. User  Mangement \"");
    		System.out.println("3. Exit From App \"");
    		System.out.println("Entre your option");


        	option = sc.nextInt();
        	if (option == 1) {
        		System.out.println("1. Product Mangement ");
        	} else if (option == 2) {
        		System.out.println("2. User  Mangement ");
        	} else if (option == 3) {
        		System.out.println("3. Exit From App ");
        		System.exit(0);
        	} else {
        		System.out.println("Hey User Choose Wrong Option");
        	}
        }
}
	   
	      
        		
	
}
