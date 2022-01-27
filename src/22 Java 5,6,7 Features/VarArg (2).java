class VarArg 
{
	void m2(int... i){}	

	void m3(int ...i){}	

	//void m3(int i...){}	
	//void m3(int i...){}	

	static void m1(int... vararg)
	{
		int noOfValues = vararg.length;
		System.out.println("var-arg method, number of values passed are: "+noOfValues);

		for (int i = 0; i < noOfValues; i++ )
		{
			System.out.print(vararg[i] +"\t");
		}
		System.out.println();
	}
	
	public static void main(String... args) 
	{
		m1();

		m1(10);
		m1(10,20);
		m1(new int[5]);
		m1(new int[]{5,6,7});


		int[] i1 = new int[5];

//		int... i2 = new int[5]; CE: not statement

	}
}
