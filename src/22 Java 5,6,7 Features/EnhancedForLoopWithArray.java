class EnhancedForLoopWithArray 
{
	public static void main(String[] args) 
	{
		String[] s = {"a", "b", "c"};

		
/*		//1.4 based for loop
		for (int i = 0 ; i< s.length; i++)
		{
			String arrayValue = s[i];

			System.out.println(arrayValue);
		}
*/
		//1.5 based enhanced for loop
		
		for (String arrayValue:s)
		{
				System.out.println(arrayValue);
		}
	}
}
