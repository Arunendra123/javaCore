class BreakContinueDemo 
{
	public static void main(String[] args) 
	{
		/*
		System.out.println("\nbreak output");
		for (int i = 0; i < 5; i++)
		{
			System.out.println();
			System.out.println(i + "Hi");

			for (int j = 0; j < 5; j++)
			{
				if(j == 3)
				{
					break;
				}
				System.out.println("    "+j + "Hello");
			}
		}

		System.out.println("\nContinue output");
		for (int i = 0; i < 5; i++)
		{
			System.out.println();
			System.out.println(i + "Hi");

			for (int j = 0; j < 5; j++)
			{
				if(j == 3)
				{
					continue;
				}
				System.out.println("    "+j + "Hello");
			}
		}
	*/
		
		int i = 0;
		l1:
		while( i < 3)
		{
			System.out.println(i + " Hi - 1st loop");

			int j = 0;
			l2:
			while (j < 5)
			{
				System.out.println("   "+j + " Hello - 2nd loop");	

				l3:
				for (int k = 0; k < 10; k++)
				{
					if (k == 4)
					{
						1. ==========
					}
					System.out.println("          "+k + " H r u - 3rd loop");	
				}

				j++;
			}
			
			i++;
		}
		
	}
}