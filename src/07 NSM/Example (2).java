class Example 
{
	static int a = 10;
	static int b = 20;

	int x = 30;
	int y = 40;

	public static void main(String[] args) 
	{
		System.out.println("a: "+a);
		System.out.println("b: "+b);

		System.out.println("Example.a: "+Example.a);
		System.out.println("Example.b: "+Example.b);

		//System.out.println("x: "+x);
		//System.out.println("y: "+y);

		//System.out.println("Example.x: "+Example.x);
		//System.out.println("Example.y: "+Example.y);

		Example e1 = new Example();
		System.out.println("e1.x: "+e1.x);
		System.out.println("e1.y: "+e1.y);

		System.out.println("e1.a: "+e1.a);
		System.out.println("e1.b: "+e1.b);

		Example e2 = new Example();
		System.out.println("e2.x: "+e2.x);
		System.out.println("e2.y: "+e2.y);

		System.out.println("e2.a: "+e2.a);
		System.out.println("e2.b: "+e2.b);

		Example e3 = null;
		System.out.println("e3.a: "+e3.a);
		System.out.println("e3.b: "+e3.b);

		System.out.println("e3.x: "+e3.x);
		System.out.println("e3.y: "+e3.y);
	
	}
}
