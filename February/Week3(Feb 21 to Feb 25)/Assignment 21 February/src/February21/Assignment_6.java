//Find the first 7 terms of (N *6N) where it is divisible by 6
package February21;

import java.util.Scanner;

public class Assignment_6 {

	public static void main(String[] args) {
		int term=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		for(int i=1;i<=term;) {
			if(term<=7) {
			if((num*6*num*term)%6==0) {
				System.out.print((num*6*num*term)+" ");
				term++;
				if(term>7)
					break;
			}
			}
		}

	}

}
