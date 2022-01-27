class MultiThreadApplication extends Thread
{
	void print0To50() 
	{
		for (int i = 0 ; i <= 50; i++)
		{
				System.out.print(i + "	");
				try
				{
					Thread.sleep(100);					
				}
				catch (InterruptedException ie)
				{
					ie.printStackTrace();
				}
		}
	}
	
	void print50To0() 
	{
		for (int i = 50 ; i >= 0; i--)
		{
				System.out.print(i + "	");
				try
				{
					Thread.sleep(100);					
				}
				catch (InterruptedException ie)
				{
					ie.printStackTrace();
				}
		}
	}

	public void run()
	{
		print50To0();
		System.out.println();
	}

	public static void main(String[] args) 
	{
		MultiThreadApplication mt = new MultiThreadApplication();

		long time1, time2;
		// Time before the execution of tasks
		time1 = System.currentTimeMillis();	
		
		//creating and starting new thread
		mt.start();		

		mt.print0To50();
		System.out.println();
		

		// Time after the execution of tasks
		time2 = System.currentTimeMillis();	

		System.out.println("\nTime taken to execute both the tasks: " + (time2 - time1)/1000 + " Secs");
	}
}