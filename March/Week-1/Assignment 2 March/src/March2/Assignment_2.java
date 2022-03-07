//make an array with user inputs of size 10. , then find middle element in an array
package March2;
import java.util.*;
public class Assignment_2 {

	public static void main(String[] args) {
		int [] arr=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element of array:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
		
			if(i==((arr.length/2)-1)) {
				System.out.println("The middle element is "+arr[i]);
				break;
			}
		}
	}

}
