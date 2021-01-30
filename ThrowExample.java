import java.lang.*;
class ThrowExample extends RuntimeException
{
	public static void main(String[] args)
	{
		//throw new ArithmeticException("Divide By zero");
		//System.out.println("hello sharma"); --> compile time error : unreachable //statement
		//System.out.println(10/0);
		//System.out.println("hello");--> here the compiler doesnt know the sop statement //will give the error so runtime error
		throw new ThrowExample();
		
	}
}
