import java.util.Scanner;

interface StackADT
{
	void push() throws Exception;
	void pop();
	void display();
}
class StackInterface implements StackADT
{
	int size,top;
	int arr[];
	Scanner s = new Scanner(System.in);
	StackInterface()
	{
		System.out.println("Enter the size of the stack");
		size = s.nextInt();
		arr = new int[size];
		top = -1;
	}
	public void push() throws Exception
	{
		if(top == arr.length-1)
		{
			System.out.println("StackOverflow");
		} 
		else
		{
			System.out.println("Enter the element to push in the stack");
			int element = s.nextInt();
			top = top+1;
			arr[top] = element;
		}
	}
	public void pop()
	{
		if(top == -1)
		{
			System.out.println("Stack Underflow");	
		}
		else
		{
			System.out.println("The Popped element is "+ arr[top]);
			top--;
		}
	}
	public void display()
	{
		if(top == -1)
		{
			System.out.println("The Stack is empty");
		}
		else
		{
			for (int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
		}
	}
	public static void main(String [] args) throws Exception
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Stack Array ADT");
		StackInterface si = new StackInterface();
		String ch ="y";
		while(ch.equals("y"))
		{
			System.out.println("Stack Array operations");
			System.out.println("1.Push\t2.Pop\t3.Display\t4.Exit");
			System.out.println("Enter your choice");
			int opt = s.nextInt();
			switch(opt)
			{
				case 1: si.push();	break;
				case 2: si.pop();	break;
				case 3: si.display();	break;
				case 4: System.exit(0);
				default : System.out.println("Invalid option");
			}
			System.out.println("Do you want to continue (y/n)");
			ch = s.next();
		}
		
	}
	
}