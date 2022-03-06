//Check if a given number is divisible by 2 and 8 but not 12
package February21;

import java.util.*;
public class Assignment_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		if((num%2==0) && (num%8==0)) {
			if(num%12!=0) {
				System.out.print(num+" is divisible by 2 and 8 but not by 12");
			}else {
				System.out.print("divisible by 2,8 and 12");
			}
		}else {
			System.out.print("Not divisible by 2 or 8");
		}

	}

}
