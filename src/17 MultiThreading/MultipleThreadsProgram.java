/*  Explains the multiple threads program execution with different logic*/
class Add extends Thread
{	
	public void run()
	{
		int sum=0;
		for (int i = 0 ; i <= 50 ;  i ++)
		{
			sum += i;
			System.out.println("The Summation : "+sum);
		}//for
	}//run
}//Add

class Sub extends Thread
{
	public void run()
	{
		int diff = 0;

		for (int i = 50 ; i >= 0 ; i--)
		{
			diff -= i;
			System.out.println("The Substraction: "+diff);
		}//for
	}//run
}//Sub

class MultipleThreadsProgram
{
	public static void main(String[] args)
	{
		System.out.println("main started");

		Add	 a=new Add();
		a.start();

		Sub s=new Sub();
		s.start();

		System.out.println("main exited");
	}//main()
}//MainMethodThread
