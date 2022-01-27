class A 
{
	static 
	{
		System.out.println("A class is loaded");
	}
	A()
	{
		System.out.println("A class object is created");
	}
}
class B
{
	static 
	{
		System.out.println("B class is loaded");
	}
	B()
	{
		System.out.println("B class object is created");
	}
}

class C
{
	static 
	{
		System.out.println("C class is loaded");
	}
	C()
	{
		System.out.println("C class object is created");
	}
}

class D
{
	static 
	{
		System.out.println("D class is loaded");
	}
	D(int a)
	{
		System.out.println("D class object is created");
	}
}

class ClassObjectCreation 
{
	public static void main(String[] args) throws Exception
	{
		//static way of class loading and object creation
		A a1 = new A();

		System.out.println();

		//only class loading
		Class.forName("B");

		System.out.println();

		//dynamic way of class loading and object creation (reflection API)
		Class		clazz	= Class.forName(args[0]);
		Object	obj		= clazz.newInstance();
		if (obj instanceof C)
		{
					C				c			= (C)obj;
		}
	}
}