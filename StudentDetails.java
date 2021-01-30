import java.lang.*;
import java.util.Scanner;
import java.io.*;

class StudentDetails{
	public static void main(String args[]) throws Exception
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the student name :");
		String name = s.nextLine();
		System.out.println("Enter How many Subjects");
		int n = s.nextInt();
		int[] marks = new int[n];
		for(int i=0; i<marks.length; i++)
		{
			System.out.println("Enter the marks");
			marks[i] = s.nextInt();
		}
		System.out.print("The student marks are ");
		for(int i=0; i<marks.length; i++)
		{
			System.out.print(" "+marks[i]);
			 
		}
		System.out.println("\nTotal marks are");
		int tot = 0;
		for(int i=0; i<marks.length; i++)
		{
			tot+= marks[i]; 
			 
		}
		System.out.print(tot);
		System.out.println("the average marks are");
		float avg = (float)tot/n;
		System.out.println(avg);
		
	}
	
}