import java.util.*;

class StringPalindrome
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = s.nextLine();
		char[] arr1 = s1.toCharArray();
		char[] arr2 = new char[s1.length()];
		for(int i = s1.length()-1,j =0;i>=0;i--,j++)
			arr2[j] = arr1[i];
		String s2 = String.valueOf(arr2);
		System.out.println("Reverse of a String "+ s2);
		if(s1.equals(s2))
		{
			System.out.println("The String is Palindrome");
		}
		else
			System.out.println("The String not a Palindrome");
		
		
	}
}
