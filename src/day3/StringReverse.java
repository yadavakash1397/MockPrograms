package day3;

public class StringReverse 
{
	static void rev(String s)
	{
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	}

	public static void main(String[] args)
	{
		rev("akash");

	}

}
