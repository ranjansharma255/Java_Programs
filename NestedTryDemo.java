import java.lang.*;
class NestedTryDemo
{
	public static void main(String[] args)
	{
		System.out.println("Nested Try");
		try
		{
			int x = args.length;
			System.out.println("x value is "+ x);
			int y =2/x;
			System.out.println("y value is "+ y);
			try
			{
				if(x==1)
					x=x/(x-1);
				if(x==2)
				{
					int a[] = {10};
					System.out.println("arr[2] value :"+a[x]);
				}
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			catch(ArrayIndexOutOfBoundsException e1)
			{
				System.out.println(e1);
			}
		}
		catch(ArithmeticException e2)
		{
			System.out.println("Divide by zero is not possible"+e2);
		}
		System.out.println("hello world");
	}
}











