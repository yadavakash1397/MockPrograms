package day3;

public class Immutable 
{

	public static void main(String[] args) 
	{
		String s1="java";	
		System.out.println(s1);
		
		String s2=s1;
		
		System.out.println(s1==s2);
		
		s1="python";
		
		System.out.println(s1==s2);
		
		System.out.println(s2);
		
		

	}

}
