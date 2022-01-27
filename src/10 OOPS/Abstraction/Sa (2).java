
class  Sa extends Ex
{
	//this class should implement m2() method to be a concreate class.
	//Also it can override m1() it needed.

	public void m2()
	{
		System.out.println("m2 in Sample");
	}

	public static void main(String[] args) 
	{
		System.out.println("Sample main");

		//I i = new I();
		//Ex e = new Ex();
		Sa s = new Sa();
		s.m1();
		s.m2();
		
		//interface and abstrct class can not be instantiated, but reference variables can be created.
		I i;
		Ex e;
	}
}
/*
O/P
>java Sa
Sample main
m1 in Exmple
m2 in Sample
*/