//Write a program to calculate the sum of all digits in a number
package Assignment18And19Feb;

import java.util.*;
public class Assignment_3 {

	public static void main(String[] args) {
		int res=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		int i=1;
		while(num!=0) {
			res+=num%10;
			num/=10;
		}
		System.out.print("Sum of digits:"+res);

	}

}
