class MethodsDemo 
{
	static void m1()
	{
		System.out.println("static m1");
	}
	static void m2(int x)
	{
		System.out.println("static int-arg m2");
	}

	void m3()
	{
		System.out.println("non-static no-arg m3");
	}
	void m4(String s)
	{
		System.out.println("non-static String-arg m4");
	}

	public static void main(String[] args) 
	{
		System.out.println("main");

		System.out.println();
		m1();
		m2(10);
		
		System.out.println();

		//m3();
		//m4("abc");
		MethodsDemo md = new MethodsDemo();
		md.m3();
		md.m4("abc");
		
	}
}
