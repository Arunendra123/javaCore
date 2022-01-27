class Example 
{
	int x;
	int y;

	void m1()
	{
		x = 50;
		y = 60;
	}

	void m2()
	{
		Example e = new Example();
		e.x = 70;
		e.y = 80;
	}

	void printXY()
	{
		System.out.println("x: "+x);
		System.out.println("y: "+y);
	}

	public static void main(String[] args) 
	{
		Example e = new Example();

		System.out.println("x,y before methods call");
		e.printXY();

		e.m1();
		System.out.println("x,y after m1() method call");
		e.printXY();

		e.m2();
		System.out.println("x,y after m2() method call");
		e.printXY();

	}
}
