class NonStaticBlockDemo 
{
	{
		System.out.println("In NSB");
	}

	NonStaticBlockDemo()
	{
		System.out.println("no-arg constructor");
	}

	NonStaticBlockDemo(int i)
	{
		System.out.println("int-arg constructor");
	}

	public static void main(String[] args) 
	{
		System.out.println("In main");

		System.out.println();
		NonStaticBlockDemo nd1 = new NonStaticBlockDemo();
		
		System.out.println();
		NonStaticBlockDemo nd2 = new NonStaticBlockDemo();

		System.out.println();
		NonStaticBlockDemo nd3 = new NonStaticBlockDemo(10);

		System.out.println();
		NonStaticBlockDemo nd4 = new NonStaticBlockDemo(20);

	}
}
