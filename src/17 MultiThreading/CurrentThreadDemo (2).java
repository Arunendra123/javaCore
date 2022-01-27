class CurrentThreadDemo 
{
	static	
	{
		System.out.println("In SB");
		Thread th = Thread.currentThread();
		System.out.println("SB exeucting in "+th.getName() + " thread\n");
	}

	public static void main(String[] args) 
	{
		System.out.println("\nIn main method");

		Thread th = Thread.currentThread();

		System.out.println("Original name and priority of main thread");
		System.out.println("current thread name: "+th.getName());
		System.out.println("current thread name: "+th.getPriority());

		th.setName("mainthread");
		th.setPriority(7);

		System.out.println("\nmodified name and priority of main thread");
		System.out.println("current thread name: "+th.getName());
		System.out.println("current thread name: "+th.getPriority());
	}
}