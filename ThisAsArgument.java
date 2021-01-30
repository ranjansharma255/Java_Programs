import java.lang.*;

class ThisAsArgument
{
	int a,b;
	public void show(ThisAsArgument x)
	{
		System.out.println("This value is "+ x.a + x.b);
	}
	public void display()
	{
		System.out.println("the display method is invoked ");
		show(this);
	}
	public static void main(String[] args)
	{
		ThisAsArgument obj = new ThisAsArgument();
		obj.a = 10;
		obj.b = 20;
		obj.display();
	}
}
