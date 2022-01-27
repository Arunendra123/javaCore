class EqualityOperators 
{
	public static void main(String[] args) 
	{
/*
		System.out.println(10 == 10);
		System.out.println(10 == 5);

		System.out.println();

		System.out.println(10 != 10);
		System.out.println(10 != 5);

		System.out.println();

		System.out.println(true == true);
		System.out.println(true == false);

		System.out.println();

		System.out.println(true != true);
		System.out.println(true != false);

		System.out.println();

		System.out.println('a' == 'b');
		System.out.println('a' != 'b');

		//scjp bits

		System.out.println(10 == 10.0);
		System.out.println(97 == 'a');
		//System.out.println(97 == "a"); //CE: incomparable types: int and String
		System.out.println("a" == "a"); 
		System.out.println(0 == 0); 
		System.out.println(0 == 0.0); 
		System.out.println(-0.0 == 0.0); 
		System.out.println(-10 == 10); 
*/
		int a = 10;
		int b = 20;
/*
		System.out.println(a < b == a > b); 
		//System.out.println(a == b < a > b); 
		//System.out.println(a == b < a != b); 
		//System.out.println(a == b != a != b); 
		System.out.println((a == b) != (a != b)); 
*/
		System.out.println(a = b); 
		//=> System.out.println(a = 20); 
		//=> System.out.println(a); 
		//=> System.out.println(20); 

		System.out.println(a == b); 
		System.out.println(a); 
		System.out.println(b); 
	
	}
}
