class Test 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("Example");		
		Class.forName("Example");		

		System.out.println(Sample.x);
		Class.forName("Sample");		
	}
}