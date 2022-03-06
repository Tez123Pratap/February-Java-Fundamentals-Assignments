//Assignment 8->Check if a string is palindrome or not
package Assignment15Feb;

import java.util.*;
public class AssignmentEight {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String string =sc.nextLine();    
        boolean flag = true;    
            
           
        for(int i = 0; i < string.length()/2; i++){    
            if(string.charAt(i) != string.charAt(string.length()-i-1)){    
                flag = false;    
                break;    
            }    
        }    
        if(flag)    
            System.out.println("Given string is palindrome");    
        else    
            System.out.println("Given string is not a palindrome");   
		

	}

}
