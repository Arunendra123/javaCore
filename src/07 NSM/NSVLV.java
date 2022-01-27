class NSVLV 
{
	int x = 10;
	int y = 20;

	void m1()
	{
		System.out.println("x: "+x);
		System.out.println("y: "+y);

		int x = 50;

		System.out.println("x: "+x);
		System.out.println("this.x: "+this.x);
		System.out.println("y: "+y);

	}

	void m2(int p, int q)
	{
		x = p;
		y = q;
	}

	void m3(int x, int y)
	{
		x = x;
		y = y;
	}

	void m4(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	void printXY()
	{
		System.out.println("x: "+x);
		System.out.println("y: "+y);
	}

	public static void main(String[] args) 
	{
		NSVLV nl	= new NSVLV();

		nl.m1();
		System.out.println("x, y after m1() call");
		nl.printXY(); //=> 10 20

		nl.m2(6, 7);
		System.out.println("x, y after m2() call");
		nl.printXY(); //=> 6 7

		nl.m3(8, 9);
		System.out.println("x, y after m3() call");
		nl.printXY(); //=> 6 7

		nl.m4(10, 11);
		System.out.println("x, y after m4() call");
		nl.printXY(); //=> 10 11
	}
}
