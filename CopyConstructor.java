
class CopyConstructor
{
	int m,n;
	CopyConstructor()
	{
		System.out.println("Default Constructor");
		m = 30;
		n = 20;
	}
	CopyConstructor(CopyConstructor c)
	{
		System.out.println("CopyConstructor");
		m = c.m+5;
		n = c.n+5;
	}
	void show()
	{
		System.out.println("m value is "+ m+ " n value is "+n);
	}
	public static void main(String[] args)
	{
		CopyConstructor c1 = new CopyConstructor();
		CopyConstructor c2 = new CopyConstructor(c1);
		c1.show();
		c2.show();
		
	}
}