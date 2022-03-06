//Write a Program to Print the Pant's style Star Pattern.
//
//*********
//**** ****
//***   ***
//**     **
//*       *
package February_25;
import java.util.*;
public class Assignment_3 {
	public static void main(String[] args) {
		  Scanner cs=new Scanner(System.in);
	        System.out.println("Enter the row size:");
	       int out,in;
	       int row_size=cs.nextInt();
	       int x=row_size;
	       int y=row_size;
	       for(out=1;out<=row_size;out++)
	       {
	           for(in=1;in<row_size*2;in++)
	           {
	               if(in>x && in<y)
	               {
	                  System.out.printf(" ");
	               }
	               else
	               {
	                System.out.printf("*");    
	               }
	           }
	           x--;
	           y++;
	           System.out.println(); 
	       }
	       cs.close();
		
	}

}
