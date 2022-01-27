class ThreadWithException extends Thread 
{
	public void run()
	{
		for (int i = 1; i <= 10 ; i++)
		{
			System.out.println("run: "+i);
		}
	}
	public static void main(String[] args) 
	{

		ThreadWithException mt = new ThreadWithException();
		mt.start();
		mt.start();

		for (int i = 1; i <= 10 ; i++)
		{
			System.out.println("main: "+i);
			if (i == 3)
			{
				throw new ArithmeticException("raised in main thread");
			}

		}



	}
}
