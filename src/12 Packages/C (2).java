package p2;

class C 
{
	public static void main(String[] args) 
	{
		System.out.println("C main");

		//A a = new A(); CE: c f s class A

		//p1.A a = new p1.A(); CE: p1.A is not public in p1; cannot be accessed from outside package

		p1.D d = new p1.D();
		d.m1();
	}
}
