package practice;

public class Pattern22 {

	/*
	 
*    
**   
* *  
*  * 
*   *
*  * 
* *  
**   
*    



	 */
	
	public static void main(String[] args) {
		
		int size = 5;
		
		for(int i = 1;i<=size;i++) {
			for(int j = 1;j<=size;j++) {
				if(j==1 ||i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			
			
			System.out.println();
		}
		for(int i = 1+1;i<=size;i++) {
			for(int j = 1;j<=size;j++) {
				if(j==1 || i+j==size+1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		
		
		
		
	}
}
