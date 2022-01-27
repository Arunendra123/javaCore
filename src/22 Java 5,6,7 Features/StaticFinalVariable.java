class Example
{
	static  final int x = 10;

	static 
	{
		System.out.println("Example class is loaded");
	}
}

class StaticFinalVariable 
{
	public static void main(String[] args) 
	{
		System.out.println(Example.x); //=>	System.out.println(10);
	}
}
/*
O/P:
====
10

if x is not final, Example.x is not repalaced with its value, hence output is:
==========
Example class is loaded
10
*/