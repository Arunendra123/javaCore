class WithOutInnerTryCatch 
{
	static void div(int a, int b, String s)
	{
		System.out.println("1");
		try
		{
				System.out.println("2");
				int c = a / b	;
				System.out.println(c);

				System.out.println("4");

				System.out.println(s.toUpperCase());

				System.out.println("5");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("6");
		}
		System.out.println("7");
	}

	public static void main(String[] args) 
	{
		div(250, 10, "abc");
		div(250, 0, "abc");
	}
}
