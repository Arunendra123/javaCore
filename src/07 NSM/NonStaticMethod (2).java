class NonStaticMethod 
{
	int x = 10;
	int y = 20;

	void m1()
	{
		System.out.println("In m1");
	}

	int m2()
	{
			System.out.println("In m2");
			return 50;
	}

	static void m3()
	{
		System.out.println("m3 start");

		//m1(); CE:
		NonStaticMethod nsm1	= new NonStaticMethod();
		nsm1.m1();

		System.out.println("m3 end");
	}
	public static void main(String[] args) 
	{
		System.out.println("main start");

		NonStaticMethod nsm2	= new NonStaticMethod();

		nsm2.m1();
		System.out.println();

		nsm2.m2();
		System.out.println();

		int p = nsm2.m2();
		System.out.println();

		System.out.println(nsm2.m2());
		System.out.println();
	
		m3();

		System.out.println("main end");
	}
}
