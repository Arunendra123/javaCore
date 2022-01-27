class  DaemonDemo implements Runnable
{
	Thread th;

	DaemonDemo()
	{
		th = new Thread(this);
		
	//	th.setDaemon(true);
		th.start();

		//th.setDaemon(true);
	}
	public void run()
	{
		System.out.println("Run: "+th.isDaemon());	

		for (int i = 0; i < 100 ; i++)
		{
			System.out.println("Run: "+i);			
		
		}
	}

	public static void main(String[] args) 
	{
		DaemonDemo dd1 = new DaemonDemo();

		
		for (int i = 0; i < 5 ; i++)
		{
			System.out.println("main: "+i);			
		}
	}
}