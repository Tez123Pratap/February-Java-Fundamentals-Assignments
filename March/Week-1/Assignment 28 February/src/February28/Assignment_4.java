//Write Calculator program including add, diff, multiply, divide, average and modulo.
//Include menu driven logic for above operations and ask if user want to continue using do while
package February28;
import java.util.*;

public class Assignment_4 {

	public static void main(String[] args) {

	    char operator;
	    Double number1, number2, result;

	    // create an object of Scanner class
	    Scanner input = new Scanner(System.in);
	    String str;
	    do {

	    // ask users to enter operator
	    System.out.println("Choose an operator: +, -, *, or /");
	    operator = input.next().charAt(0);

	    // ask users to enter numbers
	    System.out.println("Enter first number");
	    number1 = input.nextDouble();

	    System.out.println("Enter second number");
	    number2 = input.nextDouble();

	    switch (operator) {

	      // performs addition between numbers
	      case '+':
	        result = number1 + number2;
	        System.out.println(number1 + " + " + number2 + " = " + result);
	        break;

	      // performs subtraction between numbers
	      case '-':
	        result = number1 - number2;
	        System.out.println(number1 + " - " + number2 + " = " + result);
	        break;

	      // performs multiplication between numbers
	      case '*':
	        result = number1 * number2;
	        System.out.println(number1 + " * " + number2 + " = " + result);
	        break;

	      // performs division between numbers
	      case '/':
	        result = number1 / number2;
	        System.out.println(number1 + " / " + number2 + " = " + result);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }
	    System.out.print("Enter y to calculate again or n to exit:-(y/n):-");
		input.nextLine();
		str=input.nextLine();
		if(str.equals("n")) {
			System.out.print("Thanks");
			break;
		}

	    }while(str.equals("y"));

	    input.close();

	}

}
