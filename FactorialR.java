import java.lang.*;
import java.io.*;

class FactorialR
{
	int fact(int n)
	{
		if(n==0 || n==1)
		{
			return 1;
		}
		else
			return (n*fact(n-1));
	}
	public static void main(String args[]) //throws Exception
	{
		FactorialR f = new FactorialR();
		//int n= Integer.parseInt(args[0]);
		BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any Number ");
		int num = Integer.parseInt(d.readLine());
		int result= f.fact(num);
		System.out.print("The Factorial of the number is " + result);
	}
}