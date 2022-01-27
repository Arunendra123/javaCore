class Example 
{
	static Example e1 = new Example();
	Example e2;
	int x = 10;
	int y = 20;

	public static void main(String[] args) 
	{
		Example e3 = new Example();

//		System.out.println(e1.x);
	//	System.out.println(e1.y);
		//System.out.println(e1.e2);

		e1.x = 50;
		e1.y = 60;
		e1.e2 = new Example();

//		System.out.println(e1.x);
//		System.out.println(e1.y);
///		System.out.println(e1.e2);

//		System.out.println(e1.e2.x);
//		System.out.println(e1.e2.y);
//		System.out.println(e1.e2.e2);

		e1.e2.e2 = new Example();

		System.out.println(e1.e2.e2.e2);
		System.out.println(e1.e2.e2.e2.e2);
	}
}
