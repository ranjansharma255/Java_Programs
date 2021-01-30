import java.lang.*;
import java.util.Scanner;

class BinarySearch
{
	int binaryRecursive (int a[] , int low, int high, int key)
	{
		int mid;
		if(low == high)
		{
			if(key == a[high])
			{
				return low;
			}
			else 
				return 0;
		}
		else{
			mid = low + (high - low)/2;
			if(key == a[mid])
			{
				return mid;
			}
			else if (key < a[mid])
			{
				return binaryRecursive(a,low,mid-1,key);
			}
			else
			{
				return binaryRecursive(a,mid+1,high,key);
			}
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Binary Search Recursive");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the array elements");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the element to be searched ");
		int key = sc.nextInt();
		// sorting the array in ascending order
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		BinarySearch rb = new BinarySearch();
		int k = rb.binaryRecursive(arr, 0, size, key);
		if(k==0)
		{
			System.out.println("Element is not found");
			System.out.println(k);
		}
		else
		{
			System.out.println("Element is found at the index " + (k+1));
		}
	}
}