class A 
{
	static 
	{
		System.out.println("A class is loaded");
	}
}
class B
{
	static 
	{
		System.out.println("B class is loaded");
	}
}

class C
{
	static 
	{
		System.out.println("C class is loaded");
	}
}

class D
{
	static 
	{
		System.out.println("D class is loaded");
	}
}

class ClassLoaing 
{
	public static void main(String[] args) throws Exception
	{
		//static way of class loading
		A a1 = new A();
		A a2 = new A();

		Class.forName("B");
		Class.forName("B");

		//dynamic way of class loading
		Class.forName(args[0]);
	}
}
