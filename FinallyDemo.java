import java.lang.*;
class FinallyDemo
{
	public static void main(String[] args)
	{
		System.out.println("Finally Block demo ");
		int a=10, b=0, c;
		try
		{	
			c =a/b;
			System.out.println("c value is "+ c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot Access the element " + e);
		}
		finally
		{
			System.out.println("this statement should be executed compulsorily");
		}
		System.out.println("hello2");
		
	}
}