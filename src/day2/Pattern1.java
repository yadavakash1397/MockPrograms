package day2;

public class Pattern1 
{
	/*
	  
	      *
	 	 * *
	 	* * *
	   * * * *
	  * * * * *
	    
	 */

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int k=i;k<=5;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{	
				System.out.print("* ");				
			}
			System.out.println();
		}

	}

}
