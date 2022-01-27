/*	
A deadlock is a situation where in two or more competing threads are each waiting for the other to finish, and thus neither ever does.

For example two trains coming on same track opposite to each other.

In Java Deadlock is occured due to wrong use of synchronization.

Below program explains the DeadLock situation. 
*/
class FirstClass 
{
	synchronized void firstClassMethod(SecondClass sc)
	{
		String name= Thread.currentThread().getName();

        System.out.println(name +" entered into FC.firstClassMethod()");

		try{	Thread.sleep(1000); }
		catch(Exception e)	{}

		System.out.println(name +" trying to call sc.lastMethod()");

		sc.lastMethod();
	}

	synchronized void lastMethod()
	{
		System.out.println("Inside FC.lastMethod()");
	}
}

class SecondClass
{
	synchronized void secondClassMethod(FirstClass fc)
	{
		String name= Thread.currentThread().getName();

		System.out.println(name+" entered into sc.secondClassMethod()");

		try{	Thread.sleep(1000);	}
		catch(Exception e)	{}

		System.out.println(name +" trying to call fc.lastMethod()");

		fc.lastMethod();
	}
	synchronized void lastMethod()
	{
		System.out.println("Inside sc.lastMethod()");
	}
}

public class DeadLockDemo implements Runnable
{
	FirstClass		fc		= new FirstClass();
	SecondClass	sc		= new SecondClass();

	public void run()
	{
		sc.secondClassMethod(fc);//sc is Locked by Racing Thread.

		System.out.println("Back in Racing thread");
	}

	DeadLockDemo()
	{
		Thread.currentThread().setName("Mainthread");

		Thread t	 = new Thread(this,"Racing Thread");
		t.start();

		fc.firstClassMethod(sc); //fc is Locked by main Thread.

		System.out.println("Back in Main Thread");
	}

	public static void main(String[] args) 
	{
		new DeadLockDemo();
	}
}
