class VoidNonVoidMethods 
{
	static void m1()
	{
		System.out.println("void method m1");	
	}

	static int m2()
	{
		System.out.println("non-void method m2");	

		return 10;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main");
		
		m1();
		//int a = m1(); //CE:  incompatible types
		//System.out.println(m1()); //CE:  'void' type not allowed here

		m2();
		
		int x = m2();
		
		System.out.println(m2());
	}
}
