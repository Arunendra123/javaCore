class Add extends Thread
{
	int sum	 = 0;
	public void run()
	{
		for (int i = 0 ; i <= 50 ; i++)
		{
			sum += i;
			System.out.println("The Summation: "+sum);
		}
	}
}

class Sub extends Thread
{
	int diff = 0;
	public void run()
	{
		for (int i = 50 ; i >= 0 ; i--)
		{
			diff -= i;

			System.out.println("The Substraction:"+diff);
		}
	}
}

class MultipleThreadsWithDifferentLogic
{
	public static void main(String[] args)
	{
		System.out.println("main started");

		Add	 a=new Add();
		a.start();

		Sub s=new Sub();
		s.start();

		System.out.println("main exited");
	}
}