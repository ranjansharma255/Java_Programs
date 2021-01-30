import java.lang.*;

class PrimeNumber
{
	public static void main(String args[])
	{
		int n= Integer.parseInt(args[0]);
		int count=0;
		System.out.println("The Given Number is " + n);
		for(int i=2; i<n/2 ; i++)
		{
			if(n%i==0)
				count++;
		}
		
		if(count==0)
			System.out.println("The number is Prime");
		else
			System.out.println("The number is Not Prime");
	}
}