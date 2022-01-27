/*
If super class contains var-arg parameter type method and if sub class contains normal parameter type method of same type, and if we invoke that method with upcasting, then super class method is executed, as super class method is not overridden in sub class. Actually they are overloaded methods. 

If we reverse methods in super and sub classes, super class normal method is executed. 

Actually, internally compiler changes method argument to array type, Hence by the time JVM executes that method, that method argument type is array object, hence var-arg method is called.
*/

class Example
{
	void m1(int... a)
	{
			System.out.println("Ex var-arg");
	}

	void m1(int a)
	{
			System.out.println("Ex int-arg");
	}

	/*
	CE: cannot declare both m1(int[]) and m1(int...) in Example

	void m1(int[] a)
	{
			System.out.println("Ex int-array");
	}
	*/
}

class Sample extends Example
{
	void m1(int[] a)
	{
			System.out.println("Sa int-array");
	}

	void m1(int a)
	{
			System.out.println("Sa int-arg");
	}
}

class VarArgSpecialCase
{
	public static void main(String[] args) 
	{
		Sample s = new Sample();
		s.m1(10); //Sa int-arg

		Example e = new Sample();
		e.m1(10); // Sa int-arg
	}
}
