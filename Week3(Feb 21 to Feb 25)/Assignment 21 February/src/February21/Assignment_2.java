/*Compute  a&b, a|b, a^b for these manually by converting a and b to binary numbers and then confirm the output after running program
a = 7, b = 5, 
a= 17, b = 9
a = 91, b=56
*/
package February21;

public class Assignment_2 {

	public static void main(String[] args) {
		int a=7,b=5;
		System.out.println(a+"&"+b+"="+(a&b));
		System.out.println(a+"|"+b+"="+(a|b));
		System.out.println(a+"^"+b+"="+(a^b));
		a=17;
		b=9;
		System.out.println(a+"&"+b+"="+(a&b));
		System.out.println(a+"|"+b+"="+(a|b));
		System.out.println(a+"^"+b+"="+(a^b));
		a=91;
		b=56;
		System.out.println(a+"&"+b+"="+(a&b));
		System.out.println(a+"|"+b+"="+(a|b));
		System.out.println(a+"^"+b+"="+(a^b));
	}

}
