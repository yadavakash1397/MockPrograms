package day1;

public class FibinacciSeries
{

	public static void main(String[] args)
	{
		int a=0,b=1,sum;
		System.out.print(a+" "+b);
		for(int i=3;i<=10;i++)       //10 is count... so 10 no will display
		{
			sum=a+b;
			a=b;
			b=sum;
			System.out.print(" "+sum);
		}
	}

}
