class VarArgMOL 
{
	static void m1(int... a)
	{
		System.out.println("int var-arg");
	}
	static void m1(String... a)
	{
		System.out.println("String var-arg");
	}
	public static void main(String[] args) 
	{
		m1(10);			//int var-arg
		m1("abc");		//String var-arg

		//m1();				//CE: reference to m1 is ambiguous
	}
}
