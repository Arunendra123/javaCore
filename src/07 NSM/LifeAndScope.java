class LifeAndScope 
{
	int x = 10;
	int y = 20;

	static void m1()
	{
		System.out.println("In m1");

		LifeAndScope ls = new LifeAndScope();
		System.out.println("ls.x: "+ls.x);
		System.out.println("ls.y: "+ls.y);
	}	

	public static void main(String[] args) 
	{
		System.out.println("In main");
		
		m1();

		System.out.println("ls.x: "+ls.x);
		System.out.println("ls.y: "+ls.y);

	}
}
