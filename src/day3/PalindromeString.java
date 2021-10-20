package day3;

public class PalindromeString 
{
	void CheckPalindrome(String p)
	{
		int si=0,c=0;
		int ei=p.length()-1;
		
		for(int i=1;i<=p.length()/2;i++)
		{
			if(p.charAt(si)!=p.charAt(ei))
			{
				c++;
				break;
			}
			si++;
			ei--;		
		}
		
		if(c>0)
		{
			System.out.println("string is not palindrome");
		}
		else
		{
			System.out.println("String is palindrome");
		}
	}

	public static void main(String[] args) 
	{
		PalindromeString ps=new PalindromeString();
		ps.CheckPalindrome("abcba");
	}

}
