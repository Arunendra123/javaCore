class Sample //extends Example
{
	int x = 50;
	int y = 40;

	int m1()
	{
		System.out.println("Sample m1");
		return 10;
	}
	static int m2(int x)
	{
			System.out.println("Sample m2");
			return 10;
	}


	public static void main(String[] args) 
	{
		Example s = new Example();

		

		s.x = 40;
	}


}
