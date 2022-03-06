//write a program to calculate number of digit in a number entered by user
package Assignment16Feb;

import java.util.*;
public class Assignment_1 {

	public static void main(String[] args) {
		int i=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		while(num!=0) {
			++i;
			num/=10;
			
		}
		System.out.print("Number of digits is:"+i);

	}

}
