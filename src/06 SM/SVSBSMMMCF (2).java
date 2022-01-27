class SVSBSMMMCF 
{
	static int a = m1();

	static 
	{
		System.out.println("SB1");
	}

	static 
	{
		System.out.println("SB2");
	}

	static int b = m2();

	static int m1()
	{
		System.out.println("m1:a");
		return 10;
	}

	static int m2()
	{
		System.out.println("m2:b");
		return 20;
	}

	static int m3()
	{
		System.out.println("m3:c");
		return 30;
	}

	static void m4()
	{
		System.out.println("m4");
	}

	public static void main(String[] args) 
	{
		System.out.println("main");
		m4();
	}

	static
	{
		System.out.println("SB3");
		m4();
	}

	static int c = m3();

	static void m5()
	{
		System.out.println("m5");
	}
}