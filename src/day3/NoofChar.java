package day3;

public class NoofChar 
{
	static void charinstring(String s)
	{
		int n=0;
		for(int i=0;i<=s.length()-1;i++ )
		{
			if((s.charAt(i)>=65	&& s.charAt(i)<=90)||s.charAt(i)>=97&&s.charAt(i)<=122)
			{
				n++;
			}
		}
		System.out.println("no of characters are "+n);
		
	}

	public static void main(String[] args) 
	{
		charinstring("akash 53");

	}

}
