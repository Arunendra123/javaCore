class CompoundOperator 
{
	public static void main(String[] args) 
	{
		/*
		int a = 10;			
		int b = a + 10;
		int c = a += 10;  

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		*/

		int a = 10;
/*
		a += 10; 
		=> a = a + 10; 
		=> a = 10 + 10; 
		System.out.println(a);//20
*/

		a += 'a'; 
		/*
		=> a = a + 'a'; 
		=> a = 10 + 'a'; 
		=> a = 10 + 97; 
		=> a = 107; 
		*/
		System.out.println(a);//107

		//a += "a"; 
		/*
		a = a + "a"; 
		a = 10 + "a"; 
		a = "10" + "a"; 
		a = "10a"; 
		*/
		
		//on string we can only apply += operator,
		//+= operator is also overloaded
		String s = "a";
		s += "b"; //=> s = s + "b";
		System.out.println(s);//ab

		s += 10;
		System.out.println(s);//ab10

		//s -= 10;//=> s = s - 10;
		//System.out.println(s);

		s += 10 - 20; //=> s = s + (10-20);
		System.out.println(s);

	}
}