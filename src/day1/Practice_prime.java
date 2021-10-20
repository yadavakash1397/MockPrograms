package day1;

public class Practice_prime 
{	
	public static void main(String[] args) 
	{
		for(int a=0;a<=50;a++)
		{
		
			int c=0;
			if(a==0||a==1)
			{
				//System.out.println("given no is not prime no");
				c++;
			}
			else
			{
				for(int i=2;i<a;i++)
				{
					if(a%i==0)
					{
						//System.out.println("given no is not prime no");
						c++;
						break;
					}
				}
			}
			if(c==0)
			{
				System.out.println(a);
			}
			c=0;
		}

	}

}
