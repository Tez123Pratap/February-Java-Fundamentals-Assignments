/*Assignment-2-Print the Pyramid Pattern 
 * 			*
 * 		   * *
 * 		  * * *
 * 		 * * * *
 * */
public class PyramidPattern {

	public static void main(String[] args) {
		int k;
		for(int i=1;i<=4;i++) {
			k=1;
			for(int j=1;j<=8;j++) {
				if(j>=6-i && j<=4+i && k==1) {
					System.out.print("*");
					k=0;
				}else {
					System.out.print(" ");
					k=1;
				}
			}
			System.out.println();
		}
	}

}
