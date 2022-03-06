//Assignment 2-Draw flowchart that checks two numbers and print minimum of Two numbers
import java.util.Scanner;
public class MinNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1=sc.nextInt();
		System.out.println("Enter the second number:");
		int num2=sc.nextInt();
		if(num1<num2) {
			System.out.print("Minimum number is "+num1);
		}else {
			System.out.print("Minimum number is "+num2);
		}
	}

}
