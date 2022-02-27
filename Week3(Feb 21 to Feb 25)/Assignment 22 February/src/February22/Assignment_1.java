//WAP to calculate no. of digits in a number entered by user.
package February22;

import java.util.*;
public class Assignment_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		int count=0;
		while(num!=0) {
			num/=10;
			count++;
		}
		System.out.print("Total "+count+" digits in the number.");
		
	}

}
