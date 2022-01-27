class VarArgWidening 
{
	static void m1(float l)
	{
		System.out.println("float-arg");
	}

	static void m1(int... i)
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
