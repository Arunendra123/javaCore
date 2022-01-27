class Example
{
	void m1(int... a)
	{
		System.out.println("Example var-arg");
	}
}
class Sample extends Example
{
	void m1(int... a)
	{
		System.out.println("Sample var-arg");
	}
}

class VarArgMOR 
{
	public static void main(String[] args) 
	{
		Example e = new Sample();
		e.m1(10);
	}
}
