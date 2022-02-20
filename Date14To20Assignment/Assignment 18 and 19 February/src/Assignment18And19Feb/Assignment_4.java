//write a method which takes 2 numbers and 1 char(operation +, -, *, /) and performs the operation and returns the ans
package Assignment18And19Feb;

import java.util.*;

public class Assignment_4 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		operation();

	}
	static void operation(){
		int res=0;
		System.out.println("Enter two number:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("choose one operation +, -, *, /");
		char ch=sc.next().charAt(0);
		switch(ch) {
		case '+':
			res=a+b;
			System.out.println("Sum of "+a+" and "+b+" is:"+res);
			break;
		case '-':
			res=a-b;
			System.out.println("Subtraction of "+a+" and "+b+" is:"+res);
			break;
		case '*':
			res=a*b;
			System.out.println("Multiplication of "+a+" and "+b+" is:"+res);
			break;
		case '/':
			res=a/b;
			System.out.println("Division of "+a+" and "+b+" is:"+res);
			break;
		}
		
	}

}
