//Assignment 4-Draw flowchart to print 2,4,6,8, 10
import java.util.*;
public class PrintEven {

	public static void main(String[] args) {
		
		for(int num=2;num<=10;num+=2) {
			if(num%2==0) {
				System.out.println(num);
			}
		}

	}

}
