class MyThread extends Thread
{
	MyThread(String name)
	{
		super(name);
	}

	public void run()
	{
		for (int i = 0; i < 10 ; i++)
		{
			System.out.println(getName() + " i :"+i);
		} 
	}
}

class ThreadPriority  
{
	public static void main(String[] args) 
	{
		MyThread mt1 = new MyThread("child1");
		MyThread mt2 = new MyThread("child2");
	
		System.out.println("mt1 priority: "+mt1.getPriority());
		System.out.println("mt2 priority: "+mt2.getPriority());

		mt1.setPriority(6);
		mt2.setPriority(9);
	
		System.out.println("Modified priorities");
		System.out.println("mt1 priority: "+mt1.getPriority());
		System.out.println("mt2 priority: "+mt2.getPriority());
		
		mt1.start();
		mt2.start();

		for (int i = 0; i < 10 ; i++)
		{
			System.out.println("main i :"+i);
		} 
	}
}
