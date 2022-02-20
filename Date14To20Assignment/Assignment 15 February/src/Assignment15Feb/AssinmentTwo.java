//Assignment 2->Print the ASCII value of any character provide by user 
package Assignment15Feb;

import java.util.*;
public class AssinmentTwo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character:");
		char ch=sc.next().charAt(0);  
		int asciiValue=ch;
		System.out.println("Ascii Value is:"+asciiValue);

	}

}
