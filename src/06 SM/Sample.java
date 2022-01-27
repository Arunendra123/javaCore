class Sample 
{
	static int x = m3();
	static int y = m4();
	
	static 
	{
		System.out.println("Sample SB");
	}

	public static int m3()
	{
		System.out.println("Sample m3:x");
		return 30;
	}
	public static int m4()
	{
		System.out.println("Sample m4:y");
		return 40;
	}

	public static void main(String[] args) 
	{
		System.out.println("Sample main");

		System.out.println(Example.a); 
		System.out.println(Example.b);

		System.out.println(Sample.x); 
		System.out.println(Sample.y); 	
	}
}