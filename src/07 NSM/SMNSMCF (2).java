class Example 
{
	static int a = m1();

	static 
	{
		System.out.println("Example SB1");
	}

	static int b = m2();

	static 
	{
		System.out.println("Example SB2");
	}
	
	int x = m3();

	{
		System.out.println("Example NSB1");
	}
	
	int y = m4();

	{
		System.out.println("Example NSB2");
	}

	static int m1()
	{
		System.out.println("Example m1 : a");
		return 10;
	}

	static int m2()
	{
		System.out.println("Example m2 : b");
		return 20;
	}
	
	int m3()
	{
		System.out.println("Example m3 : x");
		return 30;
	}

	int m4()
	{
		System.out.println("Example m4 : y");
		return 40;
	}

	Example()
	{
		System.out.println("Example no-arg constructor");
	}
	
	Example(int x )
	{
		System.out.println("Example int-arg constructor");
	}

	public static void main(String[] args) 
	{
			System.out.println("Exmple main");
			Example e = new Example();
	}

}

class SMNSMCF
{
};