package practice;

public class Pattern22 {

	/*
	 
    *****
   *   *
  *   *
 *   *
*****




	 */
	
	public static void main(String[] args) {
		
		int size = 5;
		
		for(int i = 1;i<=size;i++) {
			for(int j=i+1;j<=size;j++) {
				System.out.print(" ");
			}
			for(int j = 1;j<=size;j++) {
				if(i==size || j==size || i==1 || j==1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			
			
			System.out.println();
		}
		
		
		
		
		
		
	}
}
