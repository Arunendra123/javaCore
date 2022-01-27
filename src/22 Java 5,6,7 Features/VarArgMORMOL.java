class Example
{
	void m1(int... a)
	{
		System.out.println("Example int-var-arg");
	}
}
class Sample extends Example
{
	void m1(int[] a)
	{
		System.out.println("Sample int-array-arg");
	}

	void m1(int a)
	{
		System.out.println("Sample int-arg");
	}
}

class VarArgMORMOL 
{
	public static void main(String[] args) 
	{
		Example e = new Sample();
		e.m1(10); //sample int-array-arg
		e.m1(10, 20); //sample int-array-arg
		e.m1(); //sample int-array-arg
		e.m1('a'); //sample int-array-arg

		//e.m1(10.0); CE:

	}
}
