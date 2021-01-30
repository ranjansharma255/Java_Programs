import java.lang.*;

class ThisConstructor{
	
	ThisConstructor(){
		this(10);
		System.out.println("hi");
		
	}
	ThisConstructor(int x)
	{
		this(x,x+1);
		System.out.println("In single parameter constructor");
		System.out.println("Called the two parameterized constructor");
	}
	ThisConstructor(int x, int y)
	{
		System.out.println("we are in the two parameterized constructor");
		System.out.println(x+y);
	}
	
	public static void main(String[] args)
	{
		ThisConstructor a = new ThisConstructor(10);
		
	}
}
