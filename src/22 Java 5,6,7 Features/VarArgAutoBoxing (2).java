class VarArgAutoBoxing 
{
	static void m1(Integer a)
	{
		System.out.println("Integer-arg");
	}
	static void m1(int... a)
	{
		System.out.println("var-arg");
	}

	public static void main(String[] args) 
	{
			m1(10);
	}
}
