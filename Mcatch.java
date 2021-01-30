import java.lang.*;

class Mcatch {
	public static void main(String[] args)
	{
		System.out.println("Before Try block");
		try{
		int s = args.length;
		System.out.println("args = " + args[0] +" "+s);
		int b = 42/s;
		int[] c = {10};
		int d = c[8];
		StringBuffer sb = new StringBuffer("java");
		System.out.println("charAt(1)" + sb.charAt(7));
		}
		catch(ArithmeticException e1)
		{
			System.out.println("divide by zero " + e1);
		}
		catch(ArrayIndexOutOfBoundsException e2)
		{
			System.out.println("Array Index out of bound" + e2);
		}
		catch(StringIndexOutOfBoundsException e3)
		{
			System.out.println("String index out of bound" + e3);
		}
		System.out.println("After Multiple catch");
	}
}