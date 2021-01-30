import java.lang.*;
class NestedTry 
{
	public static void main(String[] args)
	{
		try
		{	
			int x = args.length;
			System.out.println("x value is " + x);
			int  y = 20/x;
			System.out.println("The value of y is " + y);
			try
			{
				if(x == 1)
					x = x/(x-1);
				if(x == 2)
				{
				int[] arr = {10};
				System.out.println("arr[2] = " + arr[x]);
				}
			}
			catch(ArithmeticException e)
			{
				System.out.println("Arithmetic Exception "+e);
			}
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("array Index out of bounds "+ e1);
		}
		
	}
}