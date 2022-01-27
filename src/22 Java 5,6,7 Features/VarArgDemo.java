class Example
{
	void m1(int a)
	{
			System.out.println("Ex int-arg");
	}

	void m1(int... a)
	{
			System.out.println("Ex var-arg");
	}
}


class Sample extends Example
{
	void m1(int a)
	{
			System.out.println("Sa int-arg");
	}
}

class VarArgDemo 
{
	public static void main(String... args) 
	{
		Sample s = new Sample();
		s.m1();
		//s.m1(10);

		Example e = new Sample();
		//e.m1();

		e.m1(10);
//		e.m1(new int[0]);
	//	e.m1(new int[1][2]);
		//e.m1(new int[1][2][3]);

		//int... a;
	}
}
