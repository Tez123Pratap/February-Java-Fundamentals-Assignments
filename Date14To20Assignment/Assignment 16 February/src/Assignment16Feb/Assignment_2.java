//Assignment_2->apply do while loop to calculate factorial of a number such that,program asks user if he wants to continue,if yes program should run again  

package Assignment16Feb;

import java.util.*;
public class Assignment_2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Please choose from the following: ");

	    //Menu
	    System.out.println("1. Run Program");
	    System.out.println("2. Exit Program");

	    int choice = sc.nextInt();

	    switch (choice) {
	        case 1:
	        	System.out.println("Enter a number:");
	        	String Cont;
	        	int num=sc.nextInt();
	            do {
	            	long fct=fact(num);
	            	System.out.println("Factorial is:"+fct);
	            	System.out.println("Do you want again calculate the factorial of a number(y for Yes and n for No):");
	            	Cont=sc.nextLine();
	            	if(Cont=="n") {
	            		break;
	            	}
	            }while(Cont=="y");
	            break;
	        case 2:
	        	System.out.println("Goodbye");
	        	break;
	        default:
	            System.exit(1); // remebered from last week to set this to one
	            System.out.println("Goodbye");
	            break;
	    }	
	}
	static long fact(int x) {
		long f = 1;
		for (int i = 1; i <= x; i++) {
			f = f * i;
		}
		return f;
	}
}