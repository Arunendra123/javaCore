class Example 
{
	void add()
	{
		System.out.println("no-arg add");
	}
	
	private static float  add(int a) 
	{
		System.out.println("int-arg add");
		return 10.0f; 
	}
	
	void add(String str)
	{
		System.out.println("String-arg add");
	}
/*CE:
	int add(String str)
	{
		System.out.println("String-args");
		return 10;
	}
*/
	public static void main(String[] args) 
	{
		Example e = new Example();
		
		//overloaded methods can be called by passing its respective parameter type argument.
		e.add();
		e.add(10);
		e.add("abc");
	}
}