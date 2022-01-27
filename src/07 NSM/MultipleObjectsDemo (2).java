class MultipleObjectsDemo 
{
	//static primitive variables
	static int a = 10;
	static int b = 20;

	//non-static primitive variables
	int x = 30;
	int y = 40;

	public static void main(String[] args) 
	{
		//local primitive variables
		int p = 50;
		int q = 60;
	
		//local reference variables
		MultipleObjectsDemo md1 = new MultipleObjectsDemo();
		MultipleObjectsDemo md2 = new MultipleObjectsDemo();

		System.out.println("Accessing md1 object original values");
		System.out.println("x: "+md1.x);
		System.out.println("y: "+md1.y);

		System.out.println("Accessing md2 object original values");
		System.out.println("x: "+md2.x);
		System.out.println("y: "+md2.y);
		
		//modifing md1 object values
		md1.x = md1.x + 20;
		md1.y = md1.y + 20;

		System.out.println();
		System.out.println("Accessing md1 object values after modification");
		System.out.println("x: "+md1.x);
		System.out.println("y: "+md1.y);

		System.out.println("Accessing md2 object values after modification");
		System.out.println("x: "+md2.x);
		System.out.println("y: "+md2.y);
	}
}