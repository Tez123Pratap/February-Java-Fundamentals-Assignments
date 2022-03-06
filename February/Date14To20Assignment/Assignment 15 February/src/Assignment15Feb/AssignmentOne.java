//Assignment One->WAP to print the product of the decimal number and integer number example 8.2 and 6


package Assignment15Feb;

import java.util.*;

public class AssignmentOne {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter an integer numbeer:");
		int a=sc.nextInt();
		System.out.println("Enter an Decimal numbeer:");
		double b=sc.nextDouble();
		double res=(double)a*b;
		System.out.println("Result is :"+res);

	}

}
