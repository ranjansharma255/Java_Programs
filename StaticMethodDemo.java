import java.lang.*;

class StaticMethodDemo
{
	int roll_number;
	String name;
	static String college_name= "mrec";
	StaticMethodDemo(int r, String n)
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
		StaticMethodDemo obj = new StaticMethodDemo(518, "Ranjan Sharma");
	}
}
