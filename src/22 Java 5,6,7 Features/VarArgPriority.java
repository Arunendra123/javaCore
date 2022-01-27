class VarArgPriority 
{
	static void m1()
	{
		System.out.println("No-arg");
	}
	static void m1(int a)
	{
		System.out.println("int-arg");
	}
	static void m1(int... a)
	{
		System.out.println("var-arg");
	}

	public static void main(String[] args) 
	{
		m1();
		m1(10);
		m1(10, 20);
	}
}
