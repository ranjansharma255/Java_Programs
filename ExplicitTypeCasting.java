class ExplicitTypeCasting
{
	public static void main(String [] args)
	{
		double d = 100.45;
		long i = (long)d;
		int x = (int)d;
		System.out.println("The double value is "+d);
		System.out.println("The long value is "+i);
		System.out.println("The int value is "+x);
	}
}