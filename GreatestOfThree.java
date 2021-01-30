import java.lang.*;
import java.util.Scanner;


class GreatestOfThree
{
	public static void main(String args[]) throws Exception
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the values of the numbers ");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		if(a>b)
		{
			if(a>c)
				System.out.println(a);
			else
				System.out.println(c);
		}
		else
		{
			if(b>c)
				System.out.println(b);
			else
				System.out.println(c);
		}
		
		
		
	}
}