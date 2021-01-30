import java.lang.*;
import java.io.*;

class FibonacciR
{
	int fib(int n)
	{
		if(n==0 || n==1)
		{
			return 1;
		}
		else
		{
			return (fib(n-1) + fib(n-2));
		}
	}
	public static void main(String args[]) throws Exception
	{
		FibonacciR f = new FibonacciR();
		System.out.println("Enter the Number");
		InputStreamReader r = new InputStreamReader(System.in); //
		BufferedReader d = new BufferedReader(r);//These three lines will take input from the keyboard.
		int n = Integer.parseInt(d.readLine());//
		
		for(int i=0; i<n; i++)
		{
			System.out.print(f.fib(i));
		}
		
	}
}