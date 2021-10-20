package day1;

public class Prime_no 
{
	
	public static void main(String[] args) 
	{ 	//2,3,5,7,11,13,17,19,23,....
		int a=49,c=0;
		if(a==0||a==1)
		{
			System.out.println("not prime no");
			c++;                               
		}
		else
		{
			for(int i=2;i<a;i++)
			{
				if(a%i==0)
				{
					System.out.println("not prime no");
					c++;
					break;
				}
			}
		}
		if(c==0)
		{
			System.out.println("prime no");
		}
	}

}
