import java.lang.*;
class FirstThread extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println("FIRST THREAD "+ i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("The thread is disturbed"+e);
		}
		System.out.println("First thread completed succesfully");
	}
}
class SecondThread extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println("SECOND THREAD "+ i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Second thread is disturbed"+e);
		}
		System.out.println("Second Thread completed succesfully");
	}
}

class MultipleUserDefined{
	public static void main(String[] args)
	{
		FirstThread f1 = new FirstThread();
		SecondThread s1 = new SecondThread();
		f1.start();
		s1.start();
		try{
			f1.join();
			s1.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("The main thread is disturbed");
		}
	}
}















