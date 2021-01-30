import java.lang.*;
import java.io.*;

class FibonacciNR
{
	public static void main(String args[]) throws Exception
	{
		int n = Integer.parseInt(args[0]);
		int a=0,b=1,c=1;
		System.out.print(c);
		for(int i=1; i<=n; i++)
		{	
			c=a+b;
			System.out.print(" " + c);
			a=b;
			b=c;
		}
		
	}
}