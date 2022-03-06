//write a method to Swap Two Numbers without using third variable
package March1;
import java.util.*;
public class Assignment_3 {
	public static void swap() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number:");
		 
		  int x = sc.nextInt();  
		  int y = sc.nextInt();
		  System.out.println("Before swapping");
		  System.out.println("value of x:" + x);  
		  System.out.println("value of y:" + y);  
		  System.out.println("After swapping");  
		  x = x + y;  
		  y = x - y;  
		  x = x - y;  
		  System.out.println("value of x:" + x);  
		  System.out.println("value of y:" + y); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swap();
	}

}
