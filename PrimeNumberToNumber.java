import java.lang.*;

class PrimeNumberToNumber
{
	public static void main(String args[])
	{
		int n= Integer.parseInt(args[0]);
		int count=0;
		System.out.println("The Given Number is " + n);
		for(int i=1; i<=n ; i++)
		{	
			count=0;
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
					count++;
			}
			if(count==0)
				System.out.print(i+" ");
		}
		
	}
}