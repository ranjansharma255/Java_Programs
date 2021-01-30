import java.lang.Thread;
class A extends Thread{
	public void run()
	{
		for(int i=0; i<10; i++){
		System.out.println("Thread A " + i);
		}
	}
}
class B extends Thread{
	public void run()
	{
		for(int i=0; i<10; i++){
		System.out.println("Thread B " + i);
		}
	}
}
class ThreadPriority{
	public static void main(String[] args)
	{
		A obj1 = new A();
		B obj2 = new B();
		obj1.start();
		obj2.start();
		obj1.setPriority(Thread.NORM_PRIORITY);
		obj2.setPriority(Thread.MIN_PRIORITY);
	}
}




