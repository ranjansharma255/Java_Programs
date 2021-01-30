import java.lang.*;
import java.util.Scanner;
import java.math.*;

class QuadraticEquation
{
	public static void main(String args[]) throws Exception
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the x*x Coefficient ");
		float a = s.nextFloat();
		System.out.println("Enter the x Coefficient ");
		float b = s.nextFloat();
		System.out.println("Enter the Constant ");
		float c = s.nextFloat();
		double d = (double)((b*b)-(4*a*c));
		double x = (double)((-b + Math.sqrt(d))/(2*a));
		double y = (double)((-b - Math.sqrt(d))/(2*a));
		if(d<0)
		{
			System.out.println("There are no Roots ");
		}
		else
		{
			System.out.println("Roots of the quadratic Equation are "+ String.format("%.1f", x) + " "+ y);
		}
	}
}