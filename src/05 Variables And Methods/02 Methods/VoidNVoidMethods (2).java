class VoidNVoidMethods 
{
	void m1()
	{
		System.out.println("In NS void m1");
	}
	static void m2()
	{
		System.out.println("In S void m2");
	}
	static int m3()
	{
		System.out.println("In S Non-void m3");
		return 10;
	}
	double m4()
	{
		System.out.println("In NS non-void m4");
		return 20.45;
	}

	public static void main(String[] args) 
	{
		System.out.println("In main");
		VoidNVoidMethods nv = new VoidNVoidMethods();
		nv.m1();
		m2();
		
		System.out.println();
		
		m3();
		nv.m4();
		
		System.out.println();
		
		int x = m3();
		double d = nv.m4();
		System.out.println("In main x: "+ x);
		System.out.println("In main d: "+ d);

		System.out.println();

		System.out.println("In main:"+m3());
		System.out.println("In main:"+nv.m4());

		int y = m2();
		System.out.println(m2());

	}
}
