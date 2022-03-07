//make an array with user inputs of size 10. 
//then take multiplyng factor as 'd' from user. print the array, with all numbers, multiplied by multiplying factor"
package March2;

import java.util.Scanner;

public class Assignment_5 {

	public static void main(String[] args) {
		int [] arr=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element of array:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the multiply factor:");
		int factor=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"x"+factor+"="+arr[i]*factor);
		}

	}

}
