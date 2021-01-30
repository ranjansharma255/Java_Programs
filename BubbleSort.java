import java.lang.*;
import java.util.*;

class BubbleSort{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = s.nextInt();
		int arr[] = new int[size];
		for(int i=0; i<size; i++)
		{
			arr[i] = s.nextInt();
		}
		System.out.println("Array Before Sorting");
		for(int i=0; i<size; i++)
		{
			System.out.print(arr[i]+ " ");
		}
		int temp;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length-1-i;j++ )
			{
				if(arr[j]>arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("\nAfter Sorting Array Elements ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	
}