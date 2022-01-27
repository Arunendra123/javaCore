class DoWhileDemo 
{
	static void m1(int i)	
	{
		int j = i;
		System.out.println("Before while");

		while ( i < 10 )
		{
				System.out.println("In while");
				i += 10;
		}

		System.out.println("after while");

		i = j;

		System.out.println("Before do ... while");
		int count = 0;
		do
		{
			System.out.println("In do ... while");
			count ++;
			if ( count != 1)
			{
				i += 10;
			}		

		}while ( i < 10 );

		System.out.println("after do ... while");

		System.out.println("i: "+i);
		System.out.println("j: "+j);
		System.out.println("count: "+count);

	}
	public static void main(String[] args) 
	{
		//m1(1);
		//m1(10);		
/*
		System.out.println("hi");		
		do
		{
				System.out.println("hello");		
		}while (false);

		System.out.println("h r u");
*/
		int i, j = 10 ;

		do
		{
			i = 10;
		}while (j == 20);

		System.out.println(i);		
		

	}
}
