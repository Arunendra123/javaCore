class AdditionOperatorDemo 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;

		System.out.println(a + b);
		System.out.println("a" + "b");
		System.out.println("a + b" + a + b);
		//=> System.out.println("a + b" + 10 + b);
		//=> System.out.println("a + b" + 10 + 20);
		//=> System.out.println("a + b" + "10" + 20);
		//=> System.out.println("a + b10" + 20);
		//=> System.out.println("a + b10" + "20");
		//=> System.out.println("a + b1020");

		System.out.println("a + b" + (a + b));
		//=>System.out.println("a + b" + (10 + 20));
		//=>System.out.println("a + b" + 30);
		//=>System.out.println("a + b" + "30");
		//=>System.out.println("a + b30");

		//System.out.println("a - b" + a - b); CE: operator - cannot be applied to String, int
		System.out.println("a - b" + (a - b));//a-b-10
		System.out.println("a * b" + a * b);

		//more testing bits 
		System.out.println(10 + 20);
		System.out.println(10 + 20 + "");
		System.out.println(10 + "" + 20 );
		System.out.println("" +10 + 20 );
		System.out.println("" +(10 + 20) );
	}
}
