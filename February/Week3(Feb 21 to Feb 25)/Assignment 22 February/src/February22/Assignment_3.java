//WAP to create a function that check if no. is odd or even. call this function from main method
package February22;
import java.util.*;
public class Assignment_3 {
	static void oddEven(int n) {
		if(n%2==0) {
			System.out.print("Even number");
		}else {
			System.out.print("Odd Number");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:-");
		int num=sc.nextInt();
		oddEven(num);

	}

}
