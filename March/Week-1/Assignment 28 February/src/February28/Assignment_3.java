//write 3 different mathods each takes different number of int arguments and return its max value
package February28;

public class Assignment_3 {
	public static int max(int a,int b) {
		return(a>b?a:b);
	}
	public static int max(int a,int b,int c) {
		return((a >= b) ? ((a >= c) ? a : c) : ((b >= c) ? b : c));
	}
	public static int max1(int a,int b,int d) {
		return((a >= b) ? ((a >= d) ? a : d) : ((b >= d) ? b : d));
	}

	public static void main(String[] args) {
		int max1=max(2,3);
		int max2=max(12,100,25);
		int max3=max1(222,45,89);
		System.out.println("Method 1 max number: "+max1);
		System.out.println("Method 2 max number: "+max2);
		System.out.println("Method 3 max number: "+max3);

	}

}
