package day2;

import java.util.Scanner;

public class Pattern3 
{
	/*
	 
	      *
	     * *
	    * * *
	   * * * *
	  * * * * *
	   * * * * 
	    * * *
	     * *
	      *
	 */

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("enter length");
		Scanner reader=new Scanner(System.in);
		int length=reader.nextInt();
		System.out.println("Your diamond is being ready wait for sometime.....");
		
		int t=5;
		for(int i=t;i>=1;i--)
		{
			System.out.println(i+"sec");
			Thread.sleep(1000);
		}
		for(int i=1;i<=((length+1)/2);i++)
		{	for(int k=length/2;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=length/2;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=length/2;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		

	}

}
