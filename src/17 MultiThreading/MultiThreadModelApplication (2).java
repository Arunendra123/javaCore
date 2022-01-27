class MultiThreadModelApplication extends Thread 
{
	static PrintNumbers pn = new PrintNumbers();
	
	public void run()
	{
			pn.print50To1();
	}

	public static void main(String[] args) 
	{
		MultiThreadModelApplication mt = new MultiThreadModelApplication();
		mt.start();
	
		long time1 = System.currentTimeMillis();

			pn.print1To50();

		long time2 = System.currentTimeMillis();
	
		System.out.print("\nTime taken to complete both tasks: "+((time2- time1) / 1000.0));
	}
}
