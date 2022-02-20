//Write a java program that reads a number in inches,convert it to meter 
package Assignment15Feb;

import java.util.*;
public class AssignmentFive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number in inch:");
		int inch=sc.nextInt();
		double meter=inch*0.0254;
		System.out.print("The value in meter is "+meter);

	}

}
