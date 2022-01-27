class Example extends Thread
{
	public void run()
	{
		for (int i = 0 ; i <= 10; i++)
		{
				System.out.println(i + " : RUN");
		}
	}
}

class StartMethodRule 
{
	public static void main(String[] args) 
	{
		Example e1 = new Example();
		e1.start();
		//e1.start(); RE: java.lang.IllegalThreadStateException
		

		//But we can call start method on another object
		Example e2 = new Example();
		e2.start();

	}
}
