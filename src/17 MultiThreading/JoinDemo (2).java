/*
1. public final void join() throws InterruptedException
	- It blocks currently executing thead (th1) execution till current thread object (th2) execution is completed	 fully

2. public final synchronized void join(long millis) throws InterruptedException
	- It blocks currently executing thead (th1) execution till current thread object (th2) execution is completed only till the given period of time.

3. public final synchronized void join(long millis, int nanos)       throws InterruptedException;
	- It blocks currently executing thead (th1) execution till current thread object (th2) execution is completed only till the given period of time.
*/

//write a program to join a thread execution to another thread

public class JoinDemo extends Thread
{
	public void run()
	{
		for (int i = 0; i < 20 ; i++)
		{
			System.out.println(getName() +" : "+i);
	
			if(i == 5 && getName().equals("Child2"))
			{
				try
				{
					Thread.sleep(500);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}

			}
		}
		
	}

	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("main is started");

		JoinDemo jd1 = new JoinDemo();
		jd1.setName("Child1");
		jd1.start();

		JoinDemo jd2 = new JoinDemo();
		jd2.setName("Child2");
		jd2.start();
		
		jd1.join();
		jd2.join();

		System.out.println("main is exited");
	}
}