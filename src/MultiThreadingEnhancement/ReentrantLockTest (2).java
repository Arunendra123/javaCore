package MultiThreadingEnhancement;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class Display 
{
	 // if we will remove synchronized method. We will get mixed output
	/*public synchronized void wish(String name)
    {
    	for(int i=0;i<10;i++)
    	{
    		System.out.println("Good Morning");
    		try
    		{
    			Thread.sleep(1000);
    		}
    		catch(InterruptedException e)
    		{
    			System.out.println(e);
    		}
    		System.out.println(name);
    	}
    }*/
	ReentrantLock l1=new ReentrantLock();
	/*public void wish(String name)
    {
    	for(int i=0;i<10;i++)
    	{
    		l1.lock();
    		System.out.println("Good Morning");
    		try
    		{
    			Thread.sleep(1000);
    		}
    		catch(InterruptedException e)
    		{
    			System.out.println(e);
    		}
    		System.out.println(name);
    		l1.unlock();
    	}
    }
	*/
	/*public void wish(String name)
    {
    	for(int i=0;i<10;i++)
    	{
    		if(l1.tryLock())
    		{
    			System.out.println("Good Morning:"+Thread.currentThread().getName());
        		try
        		{
        			Thread.sleep(3000);
        		}
        		catch(InterruptedException e)
        		{
        			System.out.println(e);
        		}
        		System.out.println(name);
        		l1.unlock();
    		}
    		else
    		{
    			System.out.println("Secondary Operation:"+Thread.currentThread().getName());
    		}
    	}
    }*/
	
	public void wish(String name)
    {
    	
    	do{
    		try
    		{
    			if(l1.tryLock(3000,TimeUnit.MILLISECONDS))
        		{
        			System.out.println("Good Morning:"+Thread.currentThread().getName());
            		Thread.sleep(30000);
            		System.out.println(name);
            		l1.unlock();
            		break;
        		}
        		else
        		{
        			System.out.println("Secondary Operation:"+Thread.currentThread().getName());
        		}
    		}
    		catch(InterruptedException e)
    		{
    			System.out.println(e);
    		}
    	}
    	while(true);
    }
	
	
}
class MyThread extends Thread
{
	Display r;
	String name;
	MyThread(Display r,String name)
	{
		this.r=r;
		this.name=name;
	}
	public void run()
	{
		r.wish(name);
	}
}
public class ReentrantLockTest 
{
     public static void main(String[] args)
     {
	     Display d=new Display();
	     MyThread th=new MyThread(d,"Arunendra");
	     MyThread th1=new MyThread(d,"Arunendra Prakash");
	     th.start();
	     th1.start();     
	
     }
	 
}
