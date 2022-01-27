class MyThread extends Thread 
{
	//initial point of execution for an user defined thread
	public void run()
	{
		try
		{
			for(int i = 50; i>=0; i--) 
			{	// Task2
				System.out.print(i + "\t");
				Thread.sleep(100);
			}
		}
		catch(Exception e)
		{
			System.out.println("Interrupted");
		}
	}//run
}	// End class 

public class FirstTheadProgram
{
	public static void main(String args[]) 
	{
		long time1, time2;
		// Time before the execution of tasks 
		time1 = System.currentTimeMillis();	 

		MyThread th1 = new MyThread();
		th1.start();

		try
		{
			for(int i=1; i<=50; i++)
			{	// Task1
				System.out.print(i + "\t");
				Thread.sleep(100);
			}
		}
		catch(Exception e)
		{
		System.out.println("Interrupted");
		}
		// Time after the execution of tasks
		time2 = System.currentTimeMillis();	

		System.out.println("\nTime taken to execute both the tasks: " + (time2 -time1)/1000 + " Secs");
	}//End main() method
}//End class 
