//Assignment 7->Take String input as the Name of city and convert it to reverse string and shown on the console 
package Assignment15Feb;

import java.util.*;
public class AssignmentSeven {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String str=sc.nextLine();
		String nstr="";
        char ch;
       
      System.out.print("Original name of City : ");
      System.out.println(str);        
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i);
        nstr= ch+nstr;
      }
      System.out.println("Reversed name of city: "+ nstr);

	}

}
