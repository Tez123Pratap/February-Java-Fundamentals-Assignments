//Assignment 1-Draw flowchart that checks two numbers and print maximum of Two numbers
import java.util.*;
public class MaxNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1=sc.nextInt();
		System.out.println("Enter the second number:");
		int num2=sc.nextInt();
		if(num1>num2) {
			System.out.print("Max number is "+num1);
		}else {
			System.out.print("Max number is "+num2);
		}	

	}

}
