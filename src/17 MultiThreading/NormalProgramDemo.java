/*
-  NormalProgram.java
 - This program demonstrates time taken to execute two tasks without threading.
 */
class  NormalProgramDemo
{
	public static void main(String args[])
	{
		long time1, time2;
		// Time before the execution of tasks
		time1 = System.currentTimeMillis();	

		try
		{
			System.out.println();
			for(int i = 1 ;  i <= 50; i++) 
			{	// Task1
				System.out.print(i + "\t");
				Thread.sleep(100);
			}
		}
		catch(Exception e)
		{
			System.out.println("Interrupted");
		}

		try
		{
 			System.out.println();
			for(int i = 50 ; i >= 1 ; i--)
			{	// Task2
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

		System.out.println("\nTime taken to execute both the tasks: " + (time2 - time1)/1000 + " Secs");
	}	// End main() method
}	// End class
