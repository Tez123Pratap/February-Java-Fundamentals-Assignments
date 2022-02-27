//Find if a given number is power of 2 // Explore on logarithm function – base, exponent etc
package February21;

import java.util.*;
public class Assignment_3 {
	/* Function to check if x is power of 2*/
    static boolean isPowerOfTwo(int n)
    {
        if (n == 0)
            return false;
 
        while (n != 1) {
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;
    }
    
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter a number:");
    	int num=sc.nextInt();
        if (isPowerOfTwo(num))
            System.out.println("Yes");
        else
            System.out.println("No");
 
    }

}
