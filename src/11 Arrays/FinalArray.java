class FinalArray 
{
	public static void main(String[] args) 
	{
		//non-final array - a variable can be reinitialized with new array or null		
		int[] a = new int[5];
		System.out.println("a length before change: "+ a.length); //5

		a = new int[7];
		System.out.println("a length after change: "+ a.length); //7

		//final array - b cannot be reinitialized with new array, leads to CE
		final int[] b = new int[3];
		//b = new int[4]; //CE: cannot assign a value to final variable b

		//but its locations can be initialized with values

		b[0] = 50;
		b[1] = 60;
		
		System.out.println(b[0]); //50
		System.out.println(b[1]); //60
		System.out.println(b[2]); //0
	}
}