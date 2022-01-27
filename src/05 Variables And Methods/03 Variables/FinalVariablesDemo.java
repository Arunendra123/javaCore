class FinalVariablesDemo 
{
	//static variable
	static int a = 10;

	//static final variable
	static final int b = 20;

	//non-static variable
	int x = 30;

	//non-static final variable
	static  int y = 40;
	
	public static void main(String[] args) 
	{
		//local variable
		int p = 50;

		//local final variable
		final int q = 60;

		System.out.println("a : "+a);
		System.out.println("b : "+b);

		FinalVariablesDemo fd = new FinalVariablesDemo();
		System.out.println("x : "+fd.x);
		System.out.println("y : "+fd.y);

		System.out.println("p : "+p);
		System.out.println("q : "+q);
	}
}
