//Write a program to Print Inverted V Star Pattern.
//
//    *     
//   * *    
//  *   *   
// *     *  
//*       *
package February_25;

public class Assignment_2 {

	public static void main(String[] args) {
		int n=5;
		int i, j, k = 0;
        for (i = n - 1; i >= 0; i--)
        {
            // outer gap loop
            for (j = n - 1; j > k; j--)
            {
                System.out.print(" ");
            }
 
            
            System.out.print("*");
 
            // inner gap loop
            for (j = 1; j < (k * 2); j++)
                System.out.print(" ");
 
            if (i < n - 1)
                System.out.print("*");
            System.out.print("\n");
            k++;
        }

	}

}
