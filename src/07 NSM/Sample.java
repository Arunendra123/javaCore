class Sample 
{
	int x;
	int y;

	//non-parameterized constructor
	Sample()
	{
		System.out.println("In no-arg constructor");

		x = 10;
		y = 20;

	}

	Sample(int x, int y)
	{
		System.out.println("In parameterized constructor");

		this.x = x;
		this.y = y;
	}

	public static void main(String[] args) 
	{		
		Sample s1 = new Sample();
		Sample s2 = new Sample();

		Sample s3 = new Sample(50, 60);
		Sample s4 = new Sample(70, 80);
		Sample s5 = new Sample(70, 80);

	}
}