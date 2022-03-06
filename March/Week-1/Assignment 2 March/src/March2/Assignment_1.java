//make an array with user inputs of size 10. , then find sum of all elements in array
package March2;
import java.util.*;
public class Assignment_1 {
	public static void main(String [] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int a=sc.nextInt();
		int[] arr=new int[a];
		System.out.println("Enter the element of array:");
		for(int i=0;i>arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<arr.length;j++) {
			sum+=arr[j];
		}
		System.out.println("Sum is :"+sum);
	}

}
