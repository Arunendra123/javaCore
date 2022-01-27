package MultiThreadingEnhancement;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPool_ExecutorFramework {
	/*
	   Creating a new thread for each job may create memory and performance issue.
	   We can use the thread pool to do our job that can improve the performance of
	   our system. Java 1.5v introduces Thread Pool framework to implements thread
	   pool, it is also known as executor framework
	 */
	
	public static void main(String args[]) throws InterruptedException, ExecutionException {
		
		//creating ThreadPool with size 3 (Three thread will be created to execute the jobs)
		ExecutorService executorservice=Executors.newFixedThreadPool(3);
		
		//submit the Runnable job to pool (4 jobs and Pool size is 3)
		
		//Runnable Jobs
		PrintJob[] printjobs= {new PrintJob("Arunendra"),
				               new PrintJob("Amit"),
				               new PrintJob("Alok"),
				               new PrintJob("Susma")};
		
		for(PrintJob job:printjobs) {
			executorservice.submit(job);
		}
		
		//Callable Jobs
		//submit the Runnable job to pool (4 jobs and Pool size is 3)
		PrintJobUsingCallable[] printjobs_1= {new PrintJobUsingCallable("Arunendra"),
						               new PrintJobUsingCallable("Amit"),
						               new PrintJobUsingCallable("Alok"),
						               new PrintJobUsingCallable("Susma")};
				
				for(PrintJobUsingCallable job:printjobs_1) {
					
					//Submit, return a Future object type, Future get use to retrieve the thread return values
					Future future=executorservice.submit(job);
					System.out.println(future.get());
				}
				
		//shutdown the service
		executorservice.shutdown();
		
		
		/*
		 * NOTE: While designing a web servers and application servers we can use ThreadPool concept
		 * 
		 * */
		
	}
}

class PrintJob implements Runnable{

	String jobName;
	
	public PrintJob(String jobName) {
		super();
		this.jobName = jobName;
	}

	@Override
	public void run() {
		System.out.println(jobName+" "+Thread.currentThread().getName());
	}
}

/*
 * 
 * 
 * When we implements Runnable interface, run() must be overridden but run() return type is void
 * run() does not return anything.
 * 
 * Sometime we need a thread that should return something then we can go for Callable interface
 * It contain a method--> call() that return a Object.
 *  
 * */

class PrintJobUsingCallable implements Callable {

	String jobName;
	
	public PrintJobUsingCallable(String jobName) {
		super();
		this.jobName = jobName;
	}

	@Override
	public Object call() throws Exception {
		return new String(jobName+" "+Thread.currentThread().getName());
	}
}

