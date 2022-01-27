class Sample extends Example
{
	static int b = 30;
	int y = 40;

	static
	{
		System.out.println("Sample SB");
	}

	{
		System.out.println("Sample NSB");
	}

	Sample()
	{
		System.out.println("Sample Constructor");
	}
		
	static void m4()
	{
		System.out.println("Sample SM");
	}

	void m1()
	{
		System.out.println("m1 in Sample");
	}
	void m5()
	{
		System.out.println("Sample NSM");
	}

	public static void main(String[] args) 
	{
		System.out.println("\nSample main");

		System.out.println("a: "+a);
		System.out.println("b: "+b);
		m2();
		m4();

		System.out.println();

		Sample s = new Sample();
		s.m1();
		s.m3();
		s.m5();
	}
}