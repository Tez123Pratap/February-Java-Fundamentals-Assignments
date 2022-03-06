//Assignment 4->write a java program to convert temperature Fahrenheit to Celsius 
package Assignment15Feb;

import java.util.*;
public class AssignmentFour {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the temperature in Fahrenhite:");
		int Fahrenhite=sc.nextInt();
		int celsius= (Fahrenhite - 32) * 5/9;
		System.out.print("Temperature in celcius is:"+celsius);
		

	}

}
