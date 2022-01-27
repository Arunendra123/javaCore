class Example 
{
	private int a;

	public void setA(int a)
	{
		if(a > 0)
		{
			this.a = a;
		}
		else
		{
			System.out.println("do not pass negative number");
		}
	}

	public int getA()
	{
		return a;
	}
}