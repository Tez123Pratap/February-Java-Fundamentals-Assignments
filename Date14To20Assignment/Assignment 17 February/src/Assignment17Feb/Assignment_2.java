//Assignment_2->Write a program in java whether given number is lesser or greater than 10 if it is 
//lesser than check fruther if it is greater or lesser than 5 using ternary operator and print greater or smaller accordingly.  
package Assignment17Feb;

import java.util.*;
public class Assignment_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		String res=(num>10)?"Greater than 10":(num>5)?"Greater than 5":"Smaller than 10 and 5";
		System.out.print(num +" is "+ res);
	}

}
