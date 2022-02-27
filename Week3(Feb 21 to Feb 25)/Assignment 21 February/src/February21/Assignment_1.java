//Find the first 3 terms of 4N+9 where it is divisible by 3
package February21;

import java.util.*;
public class Assignment_1 {

	public static void main(String[] args) {
		int term=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		for(int i=1;i<=10;i++) {
			if(term<=3) {
			if((4*num*i+3)%3==0) {
				System.out.print((4*num*i+3)+" ");
				term++;
			}
			}
		}

	}

}
