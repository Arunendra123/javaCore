abstract class Example 
{
	abstract void m1();
	
	static int a = 10;
	int x = 20;

	static
	{
		System.out.println("Example SB");
	}

	{
		System.out.println("Example NSB");
	}

	Example()
	{
		System.out.println("Example Constructor");
	}
		
	static void m2()
	{
		System.out.println("Example SM");
	}
	void m3()
	{
		System.out.println("Example NSM");
	}

	public static void main(String[] args) 
	{
		System.out.println("Example main");

		System.out.println("a: "+a);
		m2();

		//Example e = new Example();
		//e.m3();
	}
}
