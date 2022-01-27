class ArrayAsArgument 
{
	static void m1(int[] ia)
	{
		for (int i = 0; i< ia.length; i++)
		{
			System.out.print(ia[i]);
		}
		System.out.println();
	}
	
	static void m1(Example[] e)
	{
			System.out.println("Example array ");
	}

	static void m1(Object[] e)
	{
			System.out.println("Object array");
	}

	static void m1(Object e)
	{
			System.out.println("Object");
	}

	public static void main(String[] args) 
	{
/*
		Example[] e = new Example['a'];
		m1(e);

		m1(new Example[5]); //Example array
		m1(new Sample[6]);	 // Example array

		m1(new Test[7]);		//Object	array 
		m1(new Object[10]);//Object	array

		m1(new int[10]);		//Object	
		m1(new Example()); //Object

		m1(10);  //Object
		//1.4 complier throws CE, 1.5 or above version compiler will accept beacuse of AB, AUB
	*/
		int[] a = new int[5];
	
		//invoking method by passing referenced array with out values
		m1(a); //00000

		int[] b = {10, 20, 30, 40};

		//invoking method by passing referenced array with values
		m1(b); //10203040
		
		//============================================
		//invoking method by passing unreferenced array with out values
		m1(new int[7]); //0000000

		//invoking method by passing unreferenced array with values
		//m1(  {4, 5, 6, 7, 8}  ); //CE: illegal start of expression

		//to pass unreferenced array with values as argument SUN introduced as new type of array is called Anonymous array.
		//Generally anonymous array is defined as a nameless array with values, but is possible to provide name also if required.
		// it is created by combining both array creation syntaxes as shown below

		//invoking method by passing anonymous array with values
		m1(  new int[]{4, 5, 6, 7, 8}  ); //45678

		int[] c = new int[]{4, 5, 6, 7, 8} ;

		//creating array with 0 size is possible
		int[] d = new int[0];
		int[] e = {};
		int[] f = new int[]{};

		System.out.println("d length: "+ d.length);
		System.out.println("e length: "+ e.length);
		System.out.println("f length: "+ f.length);

		m1(d);
	}
}