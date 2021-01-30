import java.lang.*;
class RunnableThreadDemo implements Runnable
{
	public void run()
	{
		try{
			for(int i=0; i<=10; i++)
			{
				System.out.println("Hello Sharma "+ i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Sleep is Disturbed "+e);
		}
	}
	public static void main(String[] args)
	{
		RunnableThreadDemo rtd = new RunnableThreadDemo();
		Thread td = new Thread(rtd);
		td.start();
	}
}