import java.lang.*;

class Armstrong
{
	public static void main(String args[])
	{
		int n= Integer.parseInt(args[0]);
		int rem=0,rev=0;
		int temp=n;
		while(temp>0)
		{
			rem=temp%10;
			rev=rev+(rem*rem*rem);
			temp=temp/10;
		}
		if(rev==n)
			System.out.println("The number is Armstrong");
		else
			System.out.println("The number is Not Armstrong");
	}
}