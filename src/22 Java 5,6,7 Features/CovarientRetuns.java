class A{}
class B extends A{}

class Example
{
	A m1()
	{
		return new A();
	}

}
class Sample extends Example
{
	B m1()
	{
		return new B();
	}

}
class CovarientRetuns 
{
	public static void main(String[] args) 
	{
		//WithoutCovarientRetuns
		Sample s1 = new Sample();
		//B b1 = s1.m1(); 
		B b1 = (B)s1.m1();
		
		//withCovarientRetuns
		Sample s = new Sample();
		B b = s.m1();

	}
}
