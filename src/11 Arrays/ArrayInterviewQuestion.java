class ArrayInterviewQuestion 
{
	static void m1(Object obj)
	{
		if(obj instanceof Object)
		{
			System.out.println("if");
		}
		else
		{
			System.out.println("else");
		}
	}

	public static void main(String[] args) 
	{
		m1(new Example());
		m1(new Example[10]);
		m1(new int[10]);
		m1(20);
		m1(null);
	}
}
