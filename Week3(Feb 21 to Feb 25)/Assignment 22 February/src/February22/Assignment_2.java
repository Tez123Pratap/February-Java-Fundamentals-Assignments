//Apply do while loop to calculat factorial of a number such that, program asks  user, if he wants to continue, if yes, program should run again
package February22;
import java.util.*;
public class Assignment_2 {
	static int fact(int x) {
	    int f = 1;
	    for (int i = 1; i <= x; i++) {
	        f = f * i;
	    }
	    return f;
	}

	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.print("Enter a number:");
			int num=sc.nextInt();
			int factorial=fact(num);
			System.out.println("Factorial is"+factorial);
			System.out.print("Enter y to calculate again or n to exit:-(y/n):-");
			sc.nextLine();
			str=sc.nextLine();
			if(str.equals("n")) {
				System.out.print("Thanks");
				break;
			}
		}while(str.equals("y"));

	}

}
