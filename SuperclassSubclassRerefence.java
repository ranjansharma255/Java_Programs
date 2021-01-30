import java.lang.*;

class SuperclassSubclassRerefence
{
	public static void main(String[] args)
	{
		A d = new B(); //Reference of A is d which is holding the object of B 
		B p = new B(); // Reference
	}
}

class A{
	int i;
}
class B extends A {
	int j;
}