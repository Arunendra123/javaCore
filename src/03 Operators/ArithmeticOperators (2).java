class ArithmeticOperators 
{
	public static void main(String[] args) 
	{
		System.out.println(10 + 20 * 2 + 40 / 20 % 2 * 30 - 10);
		/*
		=> System.out.println(10 + (20 * 2) + 40 / 20 % 2 * 30 - 10);
		=> System.out.println(10 + 40 + (40 / 20) % 2 * 30 - 10);
		=> System.out.println(10 + 40 + 2 % 2 * 30 - 10);
		=> System.out.println(10 + 40 + (2 % 2) * 30 - 10);
		=> System.out.println(10 + 40 + 0 * 30 - 10);
		=> System.out.println(10 + 40 + (0 * 30) - 10);
		=> System.out.println(10 + 40 + 0 - 10);
		=> System.out.println((10 + 40) + 0 - 10);
		=> System.out.println((50 + 0) - 10);
		=> System.out.println(50 - 10);
		=> System.out.println(40);
		*/
		//1. we cannot divide integer by ZERO it leads to exception java.lang.ArithmeticException: /by Zero
		
		//System.out.println(10/0); RE: java.lang.ArithmeticException: /by Zero 
		//System.out.println(0/0); RE: java.lang.ArithmeticException: /by Zero
		System.out.println(0/10); //0
	
		//but we can divide integer number with 0.0, because internally that integer number will be converted into double type
		System.out.println(10/0.0); //=>		System.out.println(10.0/0.0); Infinity
		
		//2. we can divide floating point numbers (float and double) by zero, output is Infinity or -Infinity
		//3. if we divide 0.0 by 0 output is NaN (Not a Number)

		System.out.println(10.0/0); //Inifinity
		System.out.println(0.0/0); //NaN
		System.out.println(0.0/10); //0.0

		System.out.println(-10.0/0); //-Inifinity
		System.out.println(-0.0/0); //NaN
		System.out.println(-0.0/10); //-0.0

	}
}