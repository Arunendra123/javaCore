class B  extends A
{
	static int a = 50;
	static int b = 60;

	int x = 70;
	int y = 80;

	void m1()
	{

		int a = 90;
		int b = 100;

		int x = 110;
		int y = 120;

		System.out.println("Local variables");
		System.out.println(a + " ... " + b);
		System.out.println(x + " ... " + y);

		System.out.println();

		System.out.println("Subclass  variables");
		System.out.println(this.a + " ... " + this.b);
		System.out.println(this.x + " ... " + this.y);

		System.out.println();

		System.out.println("Superclass variables");
		System.out.println(super.a + " ... " + super.b);
		System.out.println(super.x + " ... " + super.y);
	}

	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.m1();
	}
}