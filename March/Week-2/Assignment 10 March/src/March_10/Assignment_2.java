//Java Program to Use Try and Catch for Exception Handling

package March_10;

public class Assignment_2 {

	public static void main(String[] args) {
		 try  
	        {  
	        int data=50/0; //may throw exception   
	        }  
	            //handling the exception  
	        catch(ArithmeticException e)  
	        {  
	            System.out.println(e.getMessage());  
	        }  
	        System.out.println("rest of the code");

	}

}
