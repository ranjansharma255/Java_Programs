import java.lang.*;
class ThrowableDemo
{
	void division()
	{
		try{
			int n=10/0;
		}
		catch(Throwable e)
		{
			e.printStackTrace(); // this prints the stack trace.
			//at ThrowableDemo.division(ThrowableDemo.java:7)
			//at ThrowableDemo.main(ThrowableDemo.java:21)
			
			System.out.println(e.getMessage());
			// by zero
			System.out.println(e.toString());
			//java.lang.ArithmeticException: / by zero
			System.out.println(e.fillInStackTrace());
			//java.lang.ArithmeticException: / by zero
			System.out.println(e.getCause()); //null
		}
	}
	public static void main(String[] args)
	{
		ThrowableDemo td = new ThrowableDemo();
		td.division();
	}
}