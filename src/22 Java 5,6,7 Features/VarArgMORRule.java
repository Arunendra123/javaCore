class VarArgMORRule 
{
	void m1(int... a)
	{
	}

/*
	void m1(int[] a)  CE: cannot declare both m1(int[]) and m1(int...)
	{
	}
*/
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
