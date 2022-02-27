//use while loop to calculate factorial of a number by taking user input
package February22;

import java.util.Scanner;

public class Assignment_5 {

	public static void main(String[] args) {
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		int i=1;
		while(i<=num) {
			fact*=i;
			i++;
		}
		System.out.print("Factorial is "+fact);

	}

}
