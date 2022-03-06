//2. Pyramid Pattern
//     *
//    *  *
//  *  *   *
//*  *   *   *
package February24;

public class Assignment_2 {

	public static void main(String[] args) {
			int n=4;
	        for (int i=0; i<n; i++) {
	        	for (int j=n-i; j>1; j--){
	                // printing spaces
	                System.out.print(" ");
	            }
	            for (int j=0; j<=i; j++ )
	            {
	                // printing stars
	                System.out.print("* ");
	            }
	  
	            // ending line after each row
	            System.out.println();
	        }

	}

}
