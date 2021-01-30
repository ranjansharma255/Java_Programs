import java.lang.*;

class FactorialNr {
	public static void main(String args[]) {
		int n = Integer.parseInt(args[0]);
		int fact = 1;
		System.out.println("The Given Number is " + n);
		for (int i = 1; i <= n ; i++) {
			fact = fact * i;
		}

		System.out.print("The Factorial of the number is " + fact);
	}
}