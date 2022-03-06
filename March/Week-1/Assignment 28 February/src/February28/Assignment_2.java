//write 3 different mathods each takes int, float, long numbers as input and returns its multiplication value
package February28;
import java.util.*;
public class Assignment_2 {
	
	public static float method1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("**This is First method**");
		System.out.println("Ente an integer value:");
		int a=sc.nextInt();
		System.out.println("Ente a flaot value:");
		float b=sc.nextFloat();
		System.out.println("Ente a long value:");
		long c=sc.nextLong();
		return((float)(a*b*c));
	}
	public static float method2() {
		Scanner sc=new Scanner(System.in);
		System.out.println("**This is Second method**");
		System.out.println("Ente an integer value:");
		int a=sc.nextInt();
		System.out.println("Ente a flaot value:");
		float b=sc.nextFloat();
		System.out.println("Ente a long value:");
		long c=sc.nextLong();
		return((float)(a*b*c));
	}
	public static float method3() {
		Scanner sc=new Scanner(System.in);
		System.out.println("**This is Third method**");
		System.out.println("Ente an integer value:");
		int a=sc.nextInt();
		System.out.println("Ente a flaot value:");
		float b=sc.nextFloat();
		System.out.println("Ente a long value:");
		long c=sc.nextLong();
		return((float)(a*b*c));
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float result1=method1();
		System.out.println("First method result is: "+result1);
		float result2=method2();
		System.out.println("First method result is: "+result2);
		float result3=method3();
		System.out.println("First method result is: "+result3);
		
	}

}
