//write a program to print given character is vowel or Consonant using ternary operator
package Assignment17Feb;
import java.util.*;
public class Assignment_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a character:");
		char ch=sc.next().charAt(0);
		String str=(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )?" is vowel":" is consonant";
		System.out.print(ch+" "+str);
		

	}

}
