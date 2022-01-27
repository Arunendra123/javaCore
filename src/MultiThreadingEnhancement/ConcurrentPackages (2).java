package MultiThreadingEnhancement;
import java.util.concurrent.locks.ReentrantLock;
public class ConcurrentPackages 
{ 
	public static void main(String args[])
    {
	 //     There is problem with traditional synchronized keyword.
	 //     Lock(I)
	
	 //     Important methods of Lock(I)
	 //     1. void lock() --->It is use to acquire a lock, if lock is available then current 
	 //        thread will get lock.If lock is not available then it will wait until lock is free.
	
	 //     2. boolean tryLock()
	 //     If lock is available perform SAFE OPEARATION otherwise perform ALTERNATIVE OPERATION 
	 //     it returns true if it get lock.
	
	 //     3. boolean tryLock(lock time, TimeUnit unit)
	 //         TimeUnit --> it's a enum present in java.util.concurrent package
	 //         NANOSECONDS
	 //         MICROSECONDS
	 //         MILLISECOND
	 //         SECONDS
	 //         HOURS
	 //         DAYS
	 //     it try for lock if it get it continue it's execution. if lock is not available then 
	 //     thread will wait for given period of time , still lock is not available then thread
	 //     can continue it's execution
    
     //     4. void unclock();
     //     5. void lockInterruptibly()
		
	 //     Lock(I)
	 //       |
     //		  |
	 //     ReentrantLock(C)
		
	 //     we can use multiple lock on a thread and it will be counted.
	        ReentrantLock re1=new ReentrantLock();           //1.
	 
	 //     ReentrantLock re1=new ReentrantLock(boolean fairness);
	        ReentrantLock re2=new ReentrantLock(true);
	 
	 //     if fairness is true then longest waiting thread will get chance and if it is false then which thread will get the chance we 
	 //     don't know. Default value of fairness is false. 
	        ReentrantLock re3=new ReentrantLock(false);      //2.  it is same as 1. constructor.
	 
	 //     ----------------------------------------------------------------------------------------------------------------------
	 //     Important method of reentrant lock  
	 //     1. all methods of Lock(I) will be available for ReentrantLock because it implements Lock(I)
	 //     int getHoldCount()             --> it returns number of hold on this lock by current thread.
	 //     boolean isHeldByCurrentThread()--> it returns true if and only if lock is hold current thread.
	 //     int getQueueLength()           --> it returns number of thread which are waiting to get the lock.
	 //     Collection getQueuedThreads()  --> it returns the number of thread waiting to get the lock.
	 //     boolean hasQueuedThreads()     --> it returns true if any thread waiting to get the lock.
	 //     boolean isLocked()             --> it returns true if the locked is require by some thread
	 //     boolean isFair()               --> it returns true if the fairness policy is set with true value.
	 //     Thread getOwner()              --> it returns the thread which acquire the locks
	 //     ----------------------------------------------------------------------------------------------------------------------
	      
	        ReentrantLock l=new ReentrantLock();
			l.lock();
			l.lock();
			System.out.println(l.isLocked());               //true
			System.out.println(l.isHeldByCurrentThread());  //true
			System.out.println(l.getQueueLength());         //0
			l.unlock();                           
		    System.out.println(l.getHoldCount());           //1	
		    System.out.println(l.isLocked());               //true
		    l.unlock();
		    System.out.println(l.isLocked());               //false
		    System.out.println(l.isFair());                 //false
		    
		    //1.................................................... 
     }

}


