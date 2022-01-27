class TransientVariableDemo 
{
	static transient final int a = 10;
	transient int b = 20;

	public static void main(String[] args) 
	{
		//transient int p = 30;	 //CE: illegal start of expression
	}
}