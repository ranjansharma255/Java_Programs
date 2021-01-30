import java.lang.*;
class ThreadDemo extends Thread
{
	public void run()
	{
		Thread t = currentThread();
		System.out.println("Thread Status " + t.isAlive());
		try{
			for(int i=0; i<=10; i++)
			{
				System.out.println("Hello Sharma "+ i);
				t.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println("Sleep is Disturbed "+e);
		}
	}
	public static void main(String[] args)
	{
		ThreadDemo td_1 = new ThreadDemo();
		ThreadDemo td_2 = new ThreadDemo();
		System.out.println("Thread ID "+ td_1.getId());
		System.out.println("Thread ID "+ td_2.getId());
		td_1.start();
		try{
			td_1.join();
		} catch(Exception e){}
		td_2.start();
	}
}