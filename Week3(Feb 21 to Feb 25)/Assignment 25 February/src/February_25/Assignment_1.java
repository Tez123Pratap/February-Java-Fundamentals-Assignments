//Write a Program to Print Half Diamond Star Pattern.
//
//*
//**
//***
//****
//*****
//****
//***
//**
//*
package February_25;

public class Assignment_1 {

	public static void main(String[] args) {
	    int N=5;
		int i, j;
	    
	    // Loop to print the upper half
	    // diamond pattern
	    for (i = 0; i < N; i++) {
	        for (j = 0; j < i + 1; j++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	  
	    // Loop to print the lower half
	    // diamond pattern
	    for (i = 1; i < N; i++) {
	        for (j = i; j < N; j++) {
	        	System.out.print("*");
	        }
	        System.out.println();
	    }

	}

}
