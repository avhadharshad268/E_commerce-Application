package product;

import java.util.Scanner;

public class product_management {
	 public static void product_management() {
//	public static void main (String [] args )   {
	System.out.println("***Welcome To Product management***");
	System.out.println("-------------------------------------------");
	
	while(true ){
	System.out.println("**MENU**");
	System.out.println("1. Entre Product");
	System.out.println("2. Search Product");
	System.out.println("3. Delet Producat ");
	System.out.println("4. Print Producat ");
	System.out.println("5. Exit From User Management ");

	System.out.println("Entre your option");    
	Scanner sc = new Scanner(System.in);
	
	int option =sc.nextInt();
	
	switch(option) {
	case 1: 
		System.out.println("1. Entre Product");
		break;
	case 2:
		System.out.println("2. Search Product");
		break;
	case 3:
		System.out.println("3. Delet Producat ");
		break;
	case 4:
		System.out.println("4. Print Producat ");
		break;
	case 5 :
		System.out.println("Exit from user Mangemnt ");
        return;
	default : System.out.println("Invalid Option Choose ");
	
	
	}
	
	} 

	}
  
}
