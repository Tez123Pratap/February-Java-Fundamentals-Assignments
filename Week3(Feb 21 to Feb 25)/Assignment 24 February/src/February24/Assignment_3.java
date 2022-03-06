//3.Full Pyramid
//    *
//   ***
//  *****
// *******
//*********
// *******
//  *****
//   ***
//    *
package February24;

public class Assignment_3 {

	public static void main(String[] args) {
		int n=9; 	//number of required row
		int sp=n/2;	//space variable
		int st=1;
		int k=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=st;j++) {
				System.out.print("*");
				
			}
			if(i<=n/2) {
				sp--;
				st+=2;
				k++;
			}
			else {
				sp++;
				st-=2;
				k--;
			}
			System.out.println();
		}

	}

}
