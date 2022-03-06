//write a method that adds 2 numbers and returns the answer
package February28;
import java.util.*;
public class Assignment_1 {
	public static int add(int a,int b) {
		return(a+b);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int result=add(x,y);
		System.out.print("Result is: "+result);

	}

}
