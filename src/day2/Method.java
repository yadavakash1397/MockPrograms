package day2;

public class Method 
{
	int a=20;
	void m1()
	{
		
	}
}

class method2 extends Method
{
	int a=30;
	void m2()
	{
				
	}
	public static void main(String[] args) 
	{
		method2 m2=new method2();
		System.out.println(m2.a);
		//System.out.println(super.a);
	}
}