class SVSBCF 
{
	static int a = 10;
	static
	{
		System.out.println("SB:"+a);
		//System.out.println(b); CE: i f r
		System.out.println("SB:"+getB());


	
	
	}
	public static void main(String[] args) 
	{
		System.out.println("main a:"+a);
		System.out.println("main b:"+b);
		System.out.println("main getB(): "+getB());
	}

	static int getB()
	{
		return b;
	}
	static int b = 20;	
}
