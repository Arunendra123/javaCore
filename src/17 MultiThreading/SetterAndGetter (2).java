class SetterAndGetter extends Thread 
{
	public void run()
	{
		//printing the name and priority of current thread
		System.out.println("Run: "+ getName());
		System.out.println("Run: "+getPriority());
	}

	public static void main(String[] args) 
	{
		SetterAndGetter s = new SetterAndGetter();
		
		//printing default name and priority of thread 
		System.out.println("main: "+s.getName());
		System.out.println("main: "+s.getPriority());
		
		System.out.println(s);

		//setting new name and priority to the thread
		s.setName("Child");
		s.setPriority(7);
		
		//printing new name and priority to the thread
		System.out.println("main: "+s.getName());
		System.out.println("main: "+s.getPriority());
		
		//starting execution of thread with new name and priority
		s.start();
		System.out.println(s);
	}
}