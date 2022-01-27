class ThreadConstructors 
{
	public static void main(String[] args) 
	{
		System.out.println("main start");
		
		Thread th1 = new Thread();
		th1.start(); //=> thread is created in JSA with name Thread-0, and run() method is called from Thread class.

		Thread th2 = new Thread("child");
		th2.start(); //=> thread is created in JSA with name child, and run() method is called from Thread class.
		
		System.out.println(th1); //Thread[Thread-0,5,main]
		System.out.println(th2); //Thread[child,5,main]

		/*
		
		- in Thread class toString() method is overridden to print Thread object state
			as shown above, the format is 
				"Thread[<name of the thread>, <Priority>,<Thread group name>]"

		*/
		
		System.out.println("main end");

	}
}
