//Assignment 3->write a program to add 3 to the ASCII value of the any character user provides and print the equivalent character
package Assignment15Feb;

import java.util.Scanner;

public class AssignmentThree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character:");
		char ch=sc.next().charAt(0);  
		int asciiValue=ch;
		int newCh=asciiValue+3;
		System.out.println("Ascii Value is:"+(char)newCh);

	}

}
