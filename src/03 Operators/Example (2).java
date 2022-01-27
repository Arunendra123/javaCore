class Example
{
	static int m1()
	{
		System.out.println("m1");
		return 10;
	}
	
	static int m2()
	{
		System.out.println("m2");
		return 20;
	}

	public static void main(String[] args) 
	{

		int c = m1() + m2();
		System.out.println(c);

		//int x = true + 10;

		int x = 10;
		float  f1 = 10.0245f;

		float f2 = x + f1;

		System.out.println(x);
		System.out.println(f1);
		System.out.println(f2);
	}
}
