class A
{
	static void m1(int i)
	{
		System.out.println("int-arg");
	}

	public static void main(String[] args) 
	{
		m1(10);
		m1(new Integer(10)); //=> m1(new Integer(10).intValue()); 
		m1((byte)10);
		
	}
}

class B
{
	static void m1(Integer i)
	{
		System.out.println("Integer-arg");
	}

	public static void main(String[] args) 
	{
		m1(10);	//=> 	m1(Integer.valueOf(10));
		m1(new Integer(10));

		//m1(new Byte((byte)10));
		//m1((byte)10);
	}
}

class C
{
	static void m1(Integer i)
	{
		System.out.println("Integer-arg");
	}

	static void m1(int i)
	{
		System.out.println("int-arg");
	}

	static void m1(double d)
	{
		System.out.println("Double-arg");
	}

	public static void main(String[] args) 
	{
		m1(10);
		m1(new Integer(10));

	}
}

class D
{
	static void m1(int.. i)
	{
		System.out.println("var-arg");
	}
	static void m1(Integer i)
	{
		System.out.println("Integer-arg");
	}

	public static void main(String[] args) 
	{
		m1(10);
		m1(new Integer(10));
	}


};


class MethodOverloadingWithABAUB 
{
	static void m1(Integer i)
	{
		System.out.println("Integer-arg");
	}

	public static void main(String[] args) 
	{
		m1(10);	//=> 	m1(Integer.valueOf(10));
		m1(new Integer(10));

		//m1(new Byte((byte)10));
		//m1((byte)10);
	}
}
