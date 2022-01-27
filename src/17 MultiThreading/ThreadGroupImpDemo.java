/* Creating user defined Thread Group */
class ThreadGroupImp implements Runnable
{
	String name;
	Thread t;

	// Constructor
	ThreadGroupImp(ThreadGroup thg, String threadName) 
	{

		name = threadName;
		t		  = new Thread(thg, this);

		t.start();	// Start the thread

	}	// End constructor

	// This is the entry point for thread.
	public void run() 
	{

		try 
		{

			for(int i=1; i<=10; i++) {
				System.out.println(name + " : " + i);
				Thread.sleep(1000);
			}

		}
		catch(InterruptedException e)
		{
			System.out.println(name + " interrupted...");
		}

		System.out.println(name + " exiting...");

	}	// End run() method

}	// End class ThreadGroupImp



public class ThreadGroupImpDemo 
{

	public static void main(String args[]) throws InterruptedException 
	{

		ThreadGroup grpA = new ThreadGroup("Group A");
		ThreadGroup grpB = new ThreadGroup("Group B");

		ThreadGroupImp th1 = new ThreadGroupImp(grpA, "Thread1");

		ThreadGroupImp th2 = new ThreadGroupImp(grpA, "Thread2");

		ThreadGroupImp th3 = new ThreadGroupImp(grpB, "Thread3");
		
		ThreadGroupImp th4 = new ThreadGroupImp(grpB, "Thread4");

		grpA.list();
		grpB.list();

		System.out.println("Suspending GroupA...");
		grpA.suspend();

		Thread.sleep(5000);

		System.out.println("Resuming GroupA...");
		grpA.resume();

		// Waiting for the threads to end
		th1.t.join();
		th2.t.join();
		th3.t.join();
		th4.t.join();

		System.out.println("Main thread exiting...");

	}	// End main() method

}	// End class