//make an array with user inputs of size 10. then print count odd and all even numbers in an array
package March2;

import java.util.Scanner;

public class Assignment_4 {

	public static void main(String[] args) {
		int [] arr=new int[10];
		int even=0,odd=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element of array:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("the number of Even and odd element in array is:");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println("Even element: "+even+" odd Element: "+odd);

	}

}
