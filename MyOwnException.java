import java.lang.*;
class UserDefinedException extends Exception
{
	public String toString()
	{
		return "User Defined exception type error";
	}
}
class MyOwnException 
{
	static void add(int a, int b) throws UserDefinedException
	{
		if((a<0) || (b<0))
			throw new UserDefinedException();
		else
			System.out.println("Sum = "+ (a+b));
	}
	public static void main(String[] args)
	{
		try{
			add(50,100);
			add(30,-20);
		}
		catch(UserDefinedException e)
		{
			System.out.println("caught = "+ e);
		}
	}
}
