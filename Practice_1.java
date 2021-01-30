import java.lang.*;
import java.util.*;

//package names are written in small letters.
//class names are written pascals notation  first letter capital and next word first letter caps and so on.
//methods and functions names written in camel case notations i.e first letter first word small and caps after that.
//variable names also follow camel case notations as methods.
//constants are written in all caps
//Standard variable and structured variable 

/*		
		int x = 10;  (4bytes)
		double d=x;  (8bytes)
		System.out.println(d);  This is called widening conversion 
		
		double d=20.7; (8bytes)
		int c=(int) d; (4bytes)  
		This is called narrowing converison

*/
		

class Practice_1
{
	public static void main(String[] args) //throws Exception
	{
		//int a[];
		//a = new int[20];
		//int b = new int[10];
		//declaring array literal 
		//int arr = new int[] {10,20,30,40,50,60,70,80,90};
		//System.out.println(d);
		//int a[]= new int[20];
		//int b[];
		//int b[] = new int['a'];
		//int[][] a = new int[10][20];
		//System.out.println(a.length); // length is the final variable of array object  and it returns the size of the array.
		// length() is the final method for the string object, it returns the number of characters for a given string.
		//System.out.println(a.length()); 
		
		//String[] str = {"HelloWorld","Enjoyment"};
		//System.out.println(str.length); // as str is an array of the string for finding the length we use length variable.
		
		//System.out.println(str[0].length());
		//here the length() funtcion is valid because at 0th position we have a string so number of characters in that string can be given by length() method.
		// Output --->>> 2, 10
	//------------------------------------------------------------------------	
	/*	int a[] = {1, 8, 3}; 
  
        // Create an array b[] of same size as a[] 
        int b[] = new int[a.length]; 
  
        // Doesn't copy elements of a[] to b[], only makes 
        // b refer to same location 
        b = a;     
  
        // Change to b[] will also reflect in a[] as 'a' and  
        // 'b' refer to same location. 
        b[0]++; 
  
        System.out.println("Contents of a[] "); 
        for (int i=0; i<a.length; i++) 
            System.out.print(a[i] + " "); 
  
        System.out.println("\n\nContents of b[] "); 
        for (int i=0; i<b.length; i++) 
            System.out.print(b[i] + " "); */
	//------------------------------------------------------------------------
	
		int[][] a = new int[3][4];
		System.out.println(a.length); // --> 3
		System.out.print(a[0].length);// --> 4
		
	}
}

//protected acces modifier - if we declare a variable protected then we can acces it anywhere in that package 
//but from another package only child classes which are extending the protected variable member class and more over only the child class reference will be able to access it.

















