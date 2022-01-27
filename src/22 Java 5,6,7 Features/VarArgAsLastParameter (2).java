class VarArgAsLastParameter 
{

	static void m1(int[][]... i)
	{
		System.out.println("two dimentional");
	}
	
	static void m1(int x, int y)
	{
		System.out.println("int, int arg");
	}

	static void m1(int x, int y, int... z)
	{
		System.out.println("int, int, var arg");
	}

	public static void main(String[] args) 
	{
		m1(); //CE: c f s
		//m1(10); CE: c f s
		//m1(10 , 20); //int, int arg
		//m1(10 , 20 , 30); //int, int arg
		//m1(10 , 20 , 30, 40); //int, int, var arg
	}
}
