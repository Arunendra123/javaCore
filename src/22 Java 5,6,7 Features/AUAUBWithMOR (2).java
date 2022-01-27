class Example
{
	void m1(int i)	{
		System.out.println("int-arg method");
	}
}
class Sample extends Example
{
	void m1(Integer i)	{
		System.out.println("Integer-arg method");
	}

}
class AUAUBWithMOR 
{
	public static void main(String[] args) 	{
		Sample s = new Sample();
		s.m1(10); //int-arg

		Example e = new Sample();
		e.m1(10); //int-arg
	}
}
