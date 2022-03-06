//Write a program to convert Fahrenheit into Celsius.
package Assignment18And19Feb;

import java.util.Scanner;

public class Assignment_2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the temperature in Fahrenhite:");
		int Fahrenhite=sc.nextInt();
		int celsius= (Fahrenhite - 32) * 5/9;
		System.out.print("Temperature in celcius is:"+celsius);

	}

}
