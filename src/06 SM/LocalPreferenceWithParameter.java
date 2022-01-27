class LocalPreferenceWithParameter 
{
	static int a ;
	static int b ;

	static void m1()
	{
		a = 10;
		b = 20;
	}
	static void m2()
	{
		int a;
		a = 50;
		b = 60;
	}
	static void m3(int x, int y)
	{
		a = x;
		b = y;
	}
	static void m4(int a, int b)
	{
		a = a; => a = 5;
		b = b;
	}
	static void m5(int a, int b)
	{
		LocalPreferenceWithParameter.a = a;
		LocalPreferenceWithParameter.b = b;
	}

	public static void main(String[] args) 
	{
		System.out.println(a +"..." + b); //0 ... 0

		m1();
		System.out.println(a +"..." + b); //10 ... 20

		m2();
		System.out.println(a +"..." + b); //10 ... 60

		m3(70, 80);
		System.out.println(a +"..." + b); //70 ... 80

		m4(5, 6);
		System.out.println(a +"..." + b); //70 ... 80

		m5(8, 9);
		System.out.println(a +"..." + b); //8 ... 9

	}
}
