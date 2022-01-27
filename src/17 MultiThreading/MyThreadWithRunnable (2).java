class MyThreadWithRunnable implements Runnable 
{
	public void run()
	{
		System.out.println("Run");
	}

	public static void main(String[] args) 
	{
		System.out.println("main");

		MyThreadWithRunnable mtr =  new MyThreadWithRunnable();
		//mtr.start();

		Thread th1 = new Thread();
		th1.start();


		Thread th2 = new Thread(mtr);
		th2.start();


	}
}
