class AccessingNSM 
{
	int x = 10;
	int y = 20;

	void printXY()
	{
		System.out.println("x: "+x);
		System.out.println("y: "+y);
	}
	public static void main(String[] args) 
	{
		AccessingNSM n1 = new AccessingNSM();
		n1.printXY();

		AccessingNSM n2 = new AccessingNSM();
		n2.printXY();

		n1.x = 50;
		n1.y = 60;

		System.out.println();

		n1.printXY();
		n2.printXY();
	
	}
}
