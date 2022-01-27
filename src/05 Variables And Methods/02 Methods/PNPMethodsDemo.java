class PNPMethodsDemo
{
	//non-static non-parameterized method
	void m1()
	{
		System.out.println("NPM m1");
	}

	//static parameterized mathod
	static void m2(int x , int y)
	{
		System.out.println("PM m2");
	}
	public static void main(String[] args) 
	{
		System.out.println("main");

		PNPMethodsDemo p1 = new PNPMethodsDemo();
		p1.m1();

		m2(10, 20);

		//p1.m1(20); CE: m1() in PNPMethodsDemo cannot be applied to (int)
		//m2();CE: m2(int,int) in PNPMethodsDemo cannot be applied to ()
		//m2(10, 30.45);  CE: m2(int,int) in PNPMethodsDemo cannot be applied to (int,double)

	}
}
