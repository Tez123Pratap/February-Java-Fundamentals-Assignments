//Assignment_3->WAP to create a function that check a number is odd or even,call this function from main method 
package Assignment16Feb;
import java.util.*;

public class Assignment_3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		oddEven(n);

	}
	static void oddEven(int num) {
		if(num%2==0) {
			System.out.print("Number is Even.");
		}else {
			System.out.print("Number is odd.");
		}
	}
}