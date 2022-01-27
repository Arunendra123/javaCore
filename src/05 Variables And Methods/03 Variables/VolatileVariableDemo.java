class VolatileVariableDemo 
{
	static transient volatile int a = 10;
	volatile int b = 20;

	//final volatile int c = 10; CE:  illegal combination of modifiers: volatile and final

	public static void main(String[] args) 
	{
		 //volatile int p = 30;	 //CE: illegal start of expression
	}
}