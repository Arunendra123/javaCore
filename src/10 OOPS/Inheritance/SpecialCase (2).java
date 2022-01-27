class Example
{
	void m1()
	{
		System.out.println("Example m1");
	}
	void m2()
	{
		System.out.println("Example m2");
		m1();
	}
}

class Sample extends Example
{
	void m1()
	{
		System.out.println("Sample m1");
	}
}
class SpecialCase
{

	public static void main(String[] args)
	{
		Sample s = new Sample();

		s.m1();   //Sample m1
		
		System.out.println();

		s.m2();   // Example m2
					   // Example m1
	}
}
