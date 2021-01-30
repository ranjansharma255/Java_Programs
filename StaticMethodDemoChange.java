import java.lang.*;

class StaticMethodDemoChange
{
	int roll_number;
	String name;
	static String college_name= "jntu";
	static void change()
	{
		college_name = "mrec";
	}
	StaticMethodDemoChange(int r, String n)
	{
		this.roll_number = r;
		this.name = n;
		this.display();
	}
	
	void display()
	{
		System.out.println("The Student details are " + roll_number + " "+" "+name+" "+college_name);
	}
	public static void main(String[] args)
	{
		StaticMethodDemoChange.change();
		StaticMethodDemoChange obj = new StaticMethodDemoChange(518, "Ranjan Sharma");
		StaticMethodDemoChange obj2 = new StaticMethodDemoChange(5120, "hi");
		
	}
}
