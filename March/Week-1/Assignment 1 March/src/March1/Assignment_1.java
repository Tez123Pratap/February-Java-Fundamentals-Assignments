//write a method to Reverse a Number in Java
package March1;
import java.util.*;
public class Assignment_1 {
	public static void reverse(int a) {
		int reverse = 0;  
		while(a != 0)   
		{  
		int remainder = a % 10;  
		reverse = reverse * 10 + remainder;  
		a = a/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		reverse(num);
		

	}

}
