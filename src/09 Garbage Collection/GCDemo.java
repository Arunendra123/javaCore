class GCDemo
{
	//variable for storing object state
	int x;
	GCDemo(int x)
	{
		this.x = x;
	}

  	public static void main(String[] args) throws Exception
	{	
		//loop for creating 100 unreferenced objects
		int i = 0 ;		
		for( ; i < 100 ; i++)
		{
			new GCDemo(i);		
		}

		System.out.println(i + " objects have been created");
		
		// requesting JVM to destroy all unreferenced objects
		// gc() method call will not pause / block main thread (main method) execution till
		// garbage collector execution is completed.
		// for this point onwards main and gc threads both are executed concurrently.				
		System.gc();

		
		//below for loop is writen to ensure main thread is available in JVM till gc thread 			//completes its execution. otherwise we can not see all objects destruction, because GC is //a deamon thread, means service thread and is executed only till main thread is available. 
		for( int j = 0; j <= 100 ; j++)
		{
			System.out.println( "main:"+j);
		}
	}
	/*	this method is called automatically by JVM before object is destroyed.	*/
	public void finalize()
	{
		System.out.println("objects is going be destroyed and its state is: "+x);		
	}
}

The Garbage Collection can not be forced, though there are few ways by which it can be requested there is no guarantee that these requests will be taken care of by JVM.

Runtime.getRuntime().gc().









