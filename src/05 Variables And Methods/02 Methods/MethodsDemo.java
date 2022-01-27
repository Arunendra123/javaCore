class MethodsDemo 
{
	//static method
	static void m1()
	{
		System.out.println("static method m1");
	}
	//non-static method
	void m2()
	{
		System.out.println("non-static method m2");
	}

	static void m3()
	{
		System.out.println("static method m3");
		m1();
		//m2();
		MethodsDemo md = new MethodsDemo();
		md.m2();
	}

	public static void main(String[] args) 
	{
		System.out.println("main");
		System.out.println();
		m1();

		//m2();
		MethodsDemo md = new MethodsDemo();
		System.out.println();
		md.m2();
		System.out.println();
		m3();
	}
}
