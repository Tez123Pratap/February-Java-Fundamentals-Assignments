//make an array with user inputs of size 10. then print all even numbers in an array
package March2;

import java.util.Scanner;

public class Assignment_3 {

	public static void main(String[] args) {
		int [] arr=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element of array:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Even element of array is:");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}

	}

}
