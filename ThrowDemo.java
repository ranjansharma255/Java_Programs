import java.lang.*;
class ThrowDemo
{
	static int x=5,y=0,z=0;
	static int div()
	{
		try{
			if(y==0)
				throw new ArithmeticException("Division By Zero"); //if no catch block //was there then this object was sent to the jvm, here catch clause is //there so this is sent to the catch block with the message along with //the object "division by zero"
			else
				return (x/y);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception caught at div()" + e);
			throw e; // this will return the exception to place where it is called and //the place where it is called is in try block so its corresponding catch //block will be executed
		}
	}
	public static void main(String[] args)
	{
		try{
			z=div();
			System.out.println("z value = " + z);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Exception caught at main()" + ae);
		}
	}
}
