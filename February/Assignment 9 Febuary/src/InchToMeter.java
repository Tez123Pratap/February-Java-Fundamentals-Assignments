//Assignment 3-Draw flowchart that reads a number in inches, converts it to meters
import java.util.*;
public class InchToMeter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number in inch:");
		int inch=sc.nextInt();
		double meter=inch*0.0254;
		System.out.print("The value in meter is "+meter);

	}

}
