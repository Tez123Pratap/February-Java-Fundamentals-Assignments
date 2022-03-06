//Use while loop to calculate sum of numbers till n, where n is taken from user
package February22;
import java.util.*;
public class Assignment_4 {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		int i=1;
		while(i<=num) {
			sum+=i;
			i++;
		}
		System.out.print("Sum is "+sum);
	}

}
