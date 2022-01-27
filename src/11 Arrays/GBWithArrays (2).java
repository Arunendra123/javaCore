class Example 
{
	public static void main(String[] args) 
	{
		String[] s1 = new String[5];
		s1 = new String[7];

		Test t1 = new Test();
		
		Test[] t2 = {t1, new Test(), new Test()};

		t2[0] = null;
		t2[2] = new Test();
		
		t2 = null;	
	}
}
class Test{}