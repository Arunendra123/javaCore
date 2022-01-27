class VarArgAndNormalTypesInSuperSubClass 
{
	public static void main(String[] args) 
	{
		Example e = new Sample();
		e.m1(10); //=> Example int-arg
	}
}

class Example
{
	void m1(int a)
	{
		System.out.println("Exaple int-arg");
	}
}

class Sample extends Example
{
	void m1(int... a)
	{
		System.out.println("Sample var-arg");
	}
}