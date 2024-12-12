/*
Draw This Pattern
  *  
  *  
*****
  *  
  *  
*/
public class MyClass 
{
	public static void main(String[] args) 
	{
		int irange=5;
		int jrange=5;
		myCode(irange,jrange);
	}
	public static void myCode(int irange,int jrange)
	{
		int size = 5;
		for(int i = 1;i<=size;i++) 
		{
			for(int j = 1;j<=size;j++) 
			{
				if(i==3 || j==3 )
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
